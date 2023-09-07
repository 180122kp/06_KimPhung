package org.example.TestingSystem_Assigment_7.Utils;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
public class IOManager {
    private static final String FILE_NOT_EXIST_ERROR = "Error! File Not Exist.";
    private static final String OBJECT_IS_NULL_ERROR = "Error! Object is Null.";
    // Phương thức đọc nội dung từ tệp
    public static String readFile(String pathFile) throws IOException {
        if (!FileManager.isFileExists(pathFile)) {
            throw new IOException(FILE_NOT_EXIST_ERROR);
        }

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }
    // Phương thức ghi nội dung vào tệp
    public static void writeFile(String pathFile, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
            writer.write(content);
        }
    }
    // Phương thức ghi object vào tệp
    public static void writeObject(Object object, String path, String fileName) throws IOException {
        if (object == null) {
            throw new IOException(OBJECT_IS_NULL_ERROR);
        }

        String filePath = Paths.get(path, fileName).toString();
        File file = new File(filePath);

        if (!file.exists()) {
            if (!FileManager.isFileExists(path)) {
                FileManager.createNewFolder(path);
            }
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(object);
            System.out.println("Object written to file successfully.");
        }
    }

    // Phương thức đọc object từ tệp
    public static Object readObject(String filePath) throws IOException, ClassNotFoundException {
        if (!FileManager.isFileExists(filePath)) {
            throw new IOException(FILE_NOT_EXIST_ERROR);
        }

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Object object = objectInputStream.readObject();
            return object;
        }
    }
}
