package org.example.TestingSystem_Assigment_7.FrontEnd;
import java.io.IOException;

import static org.example.TestingSystem_Assigment_7.Utils.FileManager.*;
public class copyFile {
    public static void main(String[] args) {
        try {
            String sourceFilePath = "C:\\Users\\pc\\Desktop\\SourceFile.txt";
            String destinationFolderPath = "C:\\Users\\pc\\Desktop";
            String newName = "CopiedFile.txt";

            // Copy file with new name
            copyFile(sourceFilePath, destinationFolderPath, newName);

            // Copy file with the same name
            String newFolderPath = "C:\\Users\\pc\\Desktop\\NewFolder";
            copyFile(sourceFilePath, newFolderPath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
