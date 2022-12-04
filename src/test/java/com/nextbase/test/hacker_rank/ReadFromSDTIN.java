package com.nextbase.test.hacker_rank;

import java.util.Scanner;

public class ReadFromSDTIN {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int row = 1;
        while (scan.hasNext()) {
            System.out.println(row++ + " " + scan.nextLine());

        }
        scan.close();

    }

}
