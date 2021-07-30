//import Queue.QueueImplementedUsingLinkedList;
//
//import java.util.Scanner;
//
//public class PrimeAnagramUsingQueue {
//
//    public static void main(String[] args) {
//        //scanner class object creation
//        Scanner sc = new Scanner(System.in);
//        //input from user
//        System.out.print("Enter Starting Number : ");
//        int start = 0;
//        System.out.print("Enter Ending Number : ");
//        int end = 1000;
//        System.out.println("Prime numbers between " + start + " and " + end + " are : ");
//        int count = 0;
//        //loop for finding and printing all prime numbers between given range
//        for (int i = start; i <= end; i++) {
//            //logic for checking number is prime or not
//            count = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0)
//                    count = count + 1;
//            }
//            if (count == 2)
//                System.out.println(i);
//
//        }
//        // check palindromes
//
//        //declare and initialize variables
//        int temp, i;
//        int sum = 0;
//
//        System.out.println("Enter number to check for anagram");
//        //get input from user
//        i = sc.nextInt();
//
//        //store number in a temporary variable temp
//        temp = i;
//
//        //use for loop check whether number is prime or not
//        for (i = 1; i <= temp; i++) {
//            if (temp % i == 0) {
//                count++;    //increment counter when the reminder is 0
//            }
//            System.out.println(i);  //get prime numbers range 0 - 1000
//        }
//
//    }}


import Queue.QueueImplementedUsingLinkedList;

import java.util.Arrays;

public class PrimeAnagramUsingQueue {
        public boolean isPrime(int num) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            PrimeAnagramUsingQueue queue = new PrimeAnagramUsingQueue();
            int num = 1;
            int arr[][] = new int[10][100];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 100; j++) {
                    if (queue.isPrime(num)) {
                        arr[i][j] = num;
                    } else {
                        arr[i][j] = -1;
                    }
                    num++;
                }
            }

            int p = 0;
            for (int[] k1 : arr) {
               if  (p < 10) {
                    if (p == 0)
                        System.out.print("0 to 100 \t: \t");
                    else if (p == 1)
                        System.out.print("100 to 200 \t: \t");
                    else if (p == 2)
                        System.out.print("200 to 300 \t: \t");
                    else if (p == 3)
                        System.out.print("300 to 400 \t: \t");
                    else if (p == 4)
                        System.out.print("400 to 500 \t: \t");
                    else if (p == 5)
                        System.out.print("500 to 600 \t: \t");
                    else if (p == 6)
                        System.out.print("600 to 700 \t: \t");
                    else if (p == 7)
                        System.out.print("700 to 800 \t: \t");
                    else if (p == 8)
                        System.out.print("800 to 900 \t: \t");
                    else if (p == 9)
                        System.out.print("900 to 1000 \t: \t");
                    else
                        System.out.print("Can't Print More Rows");
                }
                p++;
/*
Create count arrays of size 256 for both strings.
Initialize all values in count arrays as 0.
Iterate through every character of both strings
and increment the count of character in the corresponding count arrays.
Compare count arrays.
If both count arrays are same, then return true.
              */
                for (int k2 : k1) {
                    if (k2 != -1 && k2 != 1) {
                        String str = "" + num;
                        char[] arr1 = str.toCharArray();
                        int flag = 0;
                        for (int i = 0; i <= arr1.length - 1; i++) {
                            if (arr1[i] != arr1[arr1.length - i - 1]) {
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 1) {
                            System.out.println(k2+"Not Anagram");}
                        else
                            System.out.println(k2 + "Anagram");
                        ;
                    }


                }
                System.out.println("\n");



            }


        }
    }