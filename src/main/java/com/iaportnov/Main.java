package com.iaportnov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static long _min(ArrayList<Long> arr){
        long min = Long.MAX_VALUE;
        for (long num: arr){
            if (num<min){
                min = num;
            }
        }
        return min;
    }

    public static long _max(ArrayList<Long> arr){
        long max = Long.MIN_VALUE;
        for (long num: arr){
            if (num>max){
                max = num;
            }
        }
        return max;
    }

    public static long _sum(ArrayList<Long> arr){
        long sum = 0;
        BigInteger checkNum = new BigInteger("0");
        try {
            for (long num : arr) {
                checkNum = checkNum.add(BigInteger.valueOf(num));
                if (checkNum.abs().subtract(BigInteger.valueOf(Long.MAX_VALUE)).toString().charAt(0) != '-') {
                    throw new Exception();
                }
                sum += num;
            }
        }catch (Exception e){
            System.out.println("Mnogo");
            return 0L;
        }
        return sum;
    }

    public static long _mult(ArrayList<Long> arr){
        long mult = 1;
        BigInteger checkNum = new BigInteger("1");
        try {
            for (long num : arr) {
                if (num == 0) {
                    return 0L;
                }
                checkNum = checkNum.multiply(BigInteger.valueOf(num));
                if (checkNum.abs().subtract(BigInteger.valueOf(Long.MAX_VALUE)).toString().charAt(0) != '-') {
                    throw new Exception();
                }
                mult *= num;
            }
        }catch (Exception e){
            System.out.println("Mnogo");
            return -0L;
        }
        return mult;

    }

    public static void main(String[] args) throws IOException {
        ArrayList<Long> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new Scanner(System.in).next()));
        String line = reader.readLine();
        reader.close();
        String[] array = line.split(" ");
        for (String word: array){
            arr.add(Long.valueOf(word));
        }
        System.out.println(_min(arr));
        System.out.println(_max(arr));
        System.out.println(_sum(arr));
        System.out.println(_mult(arr));
    }

}