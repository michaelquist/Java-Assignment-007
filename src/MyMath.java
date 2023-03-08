/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @date 03/07/2023
 */

import java.util.Scanner;

public class MyMath {
    public static void gcf(int a, int b) {
        int c = 0;
        while(b != 0) {
            if (a > b) {
                c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }


        }
    }

    public static void main(String[] args) {
        gcf(1112, 695); //I can't figure out how to make this print, but I'm not sure if it was even required.
    }
}
