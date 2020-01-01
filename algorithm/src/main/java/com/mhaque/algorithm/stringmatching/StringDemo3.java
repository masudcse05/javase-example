package com.mhaque.algorithm.stringmatching;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class StringDemo3 {
    public static void main(String [ ] args) throws FileNotFoundException {
        try {
            FileReader myReader = new FileReader(new File("src/main/resource/sourcefile.txt"));
            Scanner scan = new Scanner(myReader);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something when wrong.");
            e.printStackTrace();
        }
    }
}

