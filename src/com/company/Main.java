package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        int a;

        System.out.print("Write length arrays: ");
        a = scannerIn.nextInt();
        String[] firstArray = new String[a];

        System.out.println("Filling the first array: ");
        for (int i = 0; i < a; i++) {
            System.out.print("Write " + i + " symbol first array: ");
            firstArray[i] = scannerIn.next();
        }

        System.out.println("Filling the second array: ");
        String[] secondArray = new String[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Write " + i + " symbol second array: ");
            secondArray[i] = scannerIn.next();
        }

        System.out.println("Combine array: ");
        for (String i : combineArrays(firstArray, secondArray)) {
            System.out.print(i + " ");
        }
    }
    //Combines two arrays, alternating elements
    public  static  String[] combineArrays(String[] firstArray, String[] secondArray){
        String[] combineArray = new String[firstArray.length + secondArray.length];
        int l, k;
        for (int i = 0; i < firstArray.length; i++) {
            l = 2 * i;
            k = l + 1;
            combineArray[l] = firstArray[i];
            combineArray[k] = secondArray[i];
        }
        return combineArray;
    }
}
