package org.example.TestingSystem_Assigment_7.FrontEnd;
import java.io.IOException;

import static org.example.TestingSystem_Assigment_7.Utils.FileManager.*;
public class moveFile {
    public static void main(String[] args) {
        try {
            String sourceFilePath = "C:\\Users\\pc\\Desktop\\SourceFile.txt";
            String destinationFolderPath = "C:\\Users\\pc\\Desktop\\NewFolder";

            moveFile(sourceFilePath, destinationFolderPath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
