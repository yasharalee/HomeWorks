package com.nextbase.test.hacker_rank;

import java.util.Scanner;

public class HackerRankQuery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int j = 0; j < n; j++) {
                int f = (int) ( ( Math.pow(2,j) *b));
                res += f;
                System.out.print( res + " "  );
            }
            System.out.println();

        }
        in.close();
    }


}
