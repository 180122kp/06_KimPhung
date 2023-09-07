package org.example.TestingSystem_Assigment_7.FrontEnd;

import java.io.IOException;

import static org.example.TestingSystem_Assigment_7.Utils.IOManager.*;

public class IOqStream {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\pc\\Desktop\\sample.txt";

            // Đọc nội dung từ tệp
            String fileContent = readFile(filePath);
            System.out.println("File Content:\n" + fileContent);

            // Ghi nội dung vào tệp
            String newContent = "This is a new content to be written to the file.";
            writeFile(filePath, newContent);

            // Đọc lại nội dung sau khi ghi
            String updatedContent = readFile(filePath);
            System.out.println("Updated Content:\n" + updatedContent);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            String folderPath = "C:\\Users\\pc\\Desktop";
            String fileName = "object.dat";

            // Ghi object vào tệp
            String dataToWrite = "This is an object to be written.";
            writeObject(dataToWrite, folderPath, fileName);

            // Đọc object từ tệp
            Object readData = readObject(folderPath + "\\" + fileName);
            System.out.println("Read Data: " + readData);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
