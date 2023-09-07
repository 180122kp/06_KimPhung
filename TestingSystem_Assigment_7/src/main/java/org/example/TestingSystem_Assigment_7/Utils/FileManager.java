package org.example.TestingSystem_Assigment_7.Utils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    // Định nghĩa các thông báo lỗi là các hằng số
    public static final String FILE_NOT_FOUND_ERROR = "File not found.";
    public static final String FILE_EXISTS = "File exists.";
    // Phương thức kiểm tra sự tồn tại của tệp
    public static boolean isFileExists(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }
    // Phương thức tạo tệp mới
    public static void createNewFile(String pathFile) throws IOException {
        File file = new File(pathFile);

        if (file.exists()) {
            throw new IOException("Error! File Exist.");
        } else {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("Unable to create file.");
            }
        }
    }
    // Phương thức tạo tệp mới với đường dẫn và tên tệp
    public static void createNewFile(String path, String fileName) throws IOException {
        String pathFile = path + File.separator + fileName;
        createNewFile(pathFile);
    }
    // Phương thức xóa tệp
    public static void deleteFile(String pathFile) throws IOException {
        File file = new File(pathFile);

        if (!file.exists()) {
            throw new IOException("Error! File Not Exist.");
        }

        boolean deleted = file.delete();

        if (deleted) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Unable to delete file.");
        }
    }
    // Phương thức kiểm tra xem path có phải là thư mục hay không
    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }
    // Phương thức lấy tên tất cả các tệp trong thư mục
    public static List<String> getAllFileName(String path) throws IOException {
        if (!isFolder(path)) {
            throw new IOException("Error! Path is not folder.");
        }

        File folder = new File(path);
        File[] files = folder.listFiles();
        List<String> fileNames = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }

        return fileNames;
    }
    // Phương thức sao chép tệp với tên mới
    public static void copyFile(String sourceFile, String destinationPath, String newName) throws IOException {
        File source = new File(sourceFile);
        File destination = new File(destinationPath, newName);

        if (!source.exists()) {
            throw new IOException("Error! Source File Not Exist.");
        }

        if (destination.exists()) {
            throw new IOException("Error! Destination File Already Exists.");
        }

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        } finally {
            if (sourceChannel != null) {
                sourceChannel.close();
            }
            if (destinationChannel != null) {
                destinationChannel.close();
            }
        }

        System.out.println("File copied successfully.");
    }
    // Phương thức sao chép tệp với tên giữ nguyên
    public static void copyFile(String sourceFile, String newPath) throws IOException {
        File source = new File(sourceFile);

        if (!source.exists()) {
            throw new IOException("Error! Source File Not Exist.");
        }

        File destination = new File(newPath, source.getName());

        if (destination.exists()) {
            throw new IOException("Error! Destination File Already Exists.");
        }

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        } finally {
            if (sourceChannel != null) {
                sourceChannel.close();
            }
            if (destinationChannel != null) {
                destinationChannel.close();
            }
        }

        System.out.println("File copied successfully.");
    }
    // Phương thức di chuyển tệp
    public static void moveFile(String sourceFile, String destinationPath) throws IOException {
        File source = new File(sourceFile);

        if (!source.exists()) {
            throw new IOException("Error! Source File Not Exist.");
        }

        File destinationFolder = new File(destinationPath);

        if (!destinationFolder.exists()) {
            boolean created = destinationFolder.mkdirs();
            if (!created) {
                throw new IOException("Error! Unable to create destination folder.");
            }
        }

        File destination = new File(destinationPath, source.getName());

        if (destination.exists()) {
            throw new IOException("Error! Destination File Already Exists.");
        }

        boolean moved = source.renameTo(destination);

        if (moved) {
            System.out.println("File moved successfully.");
        } else {
            System.out.println("Unable to move file.");
        }
    }
    // Phương thức tạo thư mục mới
    public static void createNewFolder(String newPathFolder) throws IOException {
        File folder = new File(newPathFolder);

        if (folder.exists()) {
            throw new IOException("Error! Folder Exist.");
        }

        boolean created = folder.mkdirs();

        if (created) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Unable to create folder.");
        }
    }

    // Phương thức tải xuống tệp từ mạng
    public static void downloadFile(String fileLink, String folder) throws IOException {
        File destinationFolder = new File(folder);

        if (!destinationFolder.exists()) {
            createNewFolder(folder);
        }

        URL url = new URL(fileLink);
        URLConnection connection = url.openConnection();
        String fileName = getFileNameFromUrl(fileLink);
        File destinationFile = new File(destinationFolder, fileName);

        if (destinationFile.exists()) {
            fileName = makeFileNameUnique(destinationFolder, fileName);
            destinationFile = new File(destinationFolder, fileName);
        }

        try (InputStream in = connection.getInputStream();
             FileOutputStream out = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("File downloaded successfully.");
    }

    private static String getFileNameFromUrl(String fileLink) {
        int lastSlashIndex = fileLink.lastIndexOf("/");
        if (lastSlashIndex != -1 && lastSlashIndex < fileLink.length() - 1) {
            return fileLink.substring(lastSlashIndex + 1);
        }
        return "downloadedFile";
    }
    //đảm bảo tên tệp không bị trùng
    private static String makeFileNameUnique(File folder, String fileName) {
        //khởi tạo biến
        int count = 1; //đếm số lần cần thêm số duy nhất vào tệp
        String baseName = fileName; // biến chứa phần cơ bản của tệp
        String extension = ""; // biêến chứa phần mở rộng (gồm đuôi file)
        // kiểm tra phần mở rộng của tệp
        int lastDotIndex = fileName.lastIndexOf("."); //tìm dấu cham cuối cùng
        if (lastDotIndex != -1) {//tách tệp và phần mở rộng
            baseName = fileName.substring(0, lastDotIndex);
            extension = fileName.substring(lastDotIndex);
        }
        // kiểm tra tệp đã tồn tại hay chưa
        while (new File(folder, fileName).exists()) {
            fileName = baseName + " (" + count + ")" + extension;
            count++;
        }

        return fileName;
    }

}
