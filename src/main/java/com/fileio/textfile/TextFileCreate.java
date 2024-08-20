package com.fileio.textfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileCreate {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/src/test/resources/sample.txt";
        File file = new File(path);
        try {
            if(file.createNewFile()) // true if file is not present
            {
                System.out.println("File Created: " + file.getName());
            }
            else
            {
                System.out.println("File already present.");
            }
            fileCreateWithFiles();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void fileCreateWithFiles(){
       Path path =  Paths.get(System.getProperty("user.dir")+"/src/test/resources/tamper.pdf");

        try {
            Files.createFile(path); // If file already exists it will throw Exception
            System.out.println("File Created: " + path.getFileName());
        }
        catch(IOException e){
            // Custom message creation instead of exception.
            try{
            throw new Exception("File already present.");}
            catch (Exception exp){
                System.out.println(exp.getMessage());
            }
        }
    }
}
