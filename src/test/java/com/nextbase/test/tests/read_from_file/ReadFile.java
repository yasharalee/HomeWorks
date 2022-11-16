package com.nextbase.test.tests.read_from_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {

    URL url = new URL("https://en.wikipedia.org/wiki/Steve_Jobs");



        InputStream in = url.openStream();
        Scanner scan = new Scanner(in);

        FileWriter file2 = new FileWriter("src/test/java/com/nextbase/test/Wiki.html");
        BufferedWriter it = new BufferedWriter(file2);

        int line = 1;
        while (scan.hasNext())
        {
            it.write((line++) + ": " + scan.nextLine() + "\n");
            String str = scan.nextLine();
            System.out.println( (line++) + ": " + str);
        }
        scan.close();

    }



}
