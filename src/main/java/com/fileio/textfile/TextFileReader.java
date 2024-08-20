package com.fileio.textfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class TextFileReader {
    public static void main(String[] args) {
        /**Creating a text file with data and then read it
         * Creating and writing using - Files.write()
         * Reading a file using - Files.readAllLines()
         */
        //Define a file Path
        String filePath = System.getProperty("user.dir")+"/src/test/resources/testfile.txt";
        File file = new File(System.getProperty("user.dir")+"/src/test/resources/manish.txt");

        // Create a List for data
        List<String> lines =  Arrays.asList("I am", "Manish Gaur", "From Testing Team");

        // Create and write in a file
        writeFile(filePath,lines);

        //appending a file
        List<String> appendText = Arrays.asList("I AM THE BEST");
        try {
            Files.write(Paths.get(filePath), appendText, StandardOpenOption.APPEND);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //Read a File
        try {
            List<String> dataLines = Files.readAllLines(Paths.get(filePath));
            for (String dataLine : dataLines) {
                System.out.println(dataLine);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void writeFile(String filePath,List<String> data){
        try {
            Files.write(Paths.get(filePath), data);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void deleteFile(String path){
        File file = new File(path);
        if(file.delete()){
            System.out.println("File has deleted.");
        }
        else{
            System.out.println("Failed to delete the file, file may not exist.");
        }
    }
}
