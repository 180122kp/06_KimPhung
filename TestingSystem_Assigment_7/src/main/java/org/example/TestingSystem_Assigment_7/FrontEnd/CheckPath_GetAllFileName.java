package org.example.TestingSystem_Assigment_7.FrontEnd;
import java.io.IOException;
import java.util.List;

import static org.example.TestingSystem_Assigment_7.Utils.FileManager.*;
public class CheckPath_GetAllFileName {
    public static void main(String[] args) {
        try {
            String folderPath = "C:\\Users\\pc\\Desktop\\MyFolder";

            if (isFolder(folderPath)) {
                List<String> fileNames = getAllFileName(folderPath);

                if (fileNames.isEmpty()) {
                    System.out.println("Folder is empty.");
                } else {
                    System.out.println("File names in the folder:");
                    for (String fileName : fileNames) {
                        System.out.println(fileName);
                    }
                }
            } else {
                System.out.println("Error: Path is not folder.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
