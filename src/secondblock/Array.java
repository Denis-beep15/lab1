package secondblock;

import java.util.Scanner;

public class Array {

    public static void mass(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void input(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " element");
            array[i] = scan.nextInt();
        }
    }

    public static int sum(int[] array) {
        int summ = 0;
        for (int j : array) {
            summ += j;
        }
        return summ;
    }

    public static int evenNum(int[] array) {
        int k = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public static int segment(int[] array, int a, int b) {
        int n = 0;
        for (int j : array) {
            if (j >= a && j <= b) {
                n++;
            } else if (a > b) {
                if (j >= b && j <= a) {
                    n++;
                }
            }
        }
        return n;
    }

    public static boolean positiveNum(int[] array) {
        boolean check = true;
        for (int j : array) {
            if (j <= 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void reverse(int[] array) {
        int r;
        int l = array.length;
        for (int i = 0; i < l / 2; i++) {
            r = array[i];
            array[i] = array[l - 1 - i];
            array[l - 1 - i] = r;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 9, 3, 5, 6, 0, 5, 87, 35};
        mass(array);
        input(array);
        System.out.println("Sum of elements = " + sum(array));
        System.out.println("The number of even numbers = " + evenNum(array));
        System.out.println("In a segment of numbers: " + segment(array, 4, 9));
        if (positiveNum(array)) {
            System.out.println("All numbers are positive");
        } else {
            System.out.println("Not all numbers are positive");
        }
        reverse(array);
    }
}
