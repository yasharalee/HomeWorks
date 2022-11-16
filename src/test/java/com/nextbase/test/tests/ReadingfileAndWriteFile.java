package com.nextbase.test.tests;

import com.nextbase.test.utilities.Utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingfileAndWriteFile {
    public static void main(String[] args) throws Exception {

        FileReader file = null;
        try {
            file = new FileReader("src/test/java/com/nextbase/test/Hi.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader read = new BufferedReader(file);
        try {
            // line 20 must be repeated for each line in txt file
            System.out.println(read.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("=================================================");

        // reads all the lines with loop
        Scanner scan = new Scanner(new FileReader("src/test/java/com/nextbase/test/Hi.txt"));
        //while (scan.hasNextLine()) <-OR->  while (scan.hasNext())
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        System.out.println("=================================================");

        FileWriter file2 = new FileWriter("src/test/java/com/nextbase/test/write.txt");
        BufferedWriter write = new BufferedWriter(file2);
        write.write("hey everyone");
        write.write("\nI hope ou guys are well");
        write.write("\nhey everyone");
        write.close(); // must be closed to write in file

        System.out.println("=================================================");

        List<String> list = new ArrayList<>(Arrays.asList("apple", "apple", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "apple", "date", "date", "date", "date", "date", "date"));



        System.out.println(Utilities.mostRepeated(list));


        int[] arr2 = {1,2,3,3,3,4,4,5,5,6,6};
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        System.out.println(Utilities.mostRepeated(list2));


        System.out.println("=================================================");



    }
}
