package org.example.TestingSystem_Assigment_7.FrontEnd;

import static org.example.TestingSystem_Assigment_7.Utils.FileManager.*;

public class checkfile_is_exits {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\pc\\Desktop\\Test.txt";

        if (isFileExists(filePath)) {
            System.out.println(FILE_EXISTS);
        } else {
            System.out.println(FILE_NOT_FOUND_ERROR);
        }
    }
}
