package com.iaportnov.service;

import com.iaportnov.Main;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserServiceTest {

    public ArrayList<Long> Reader(String path) throws IOException {
        ArrayList<Long> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        reader.close();
        String[] array = line.split(" ");
        for (String word: array){
            arr.add(Long.valueOf(word));
        }
        return arr;
    }

    @Test
    public void testSum()
    {
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test1.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(5050, Main._sum(testList));
    }
    @Test
    public void testMult()
    {
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/testMult");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(2432902008176640000L, Main._mult(testList));
    }
    @Test
    public void testMin()    {
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test1.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1, Main._min(testList));
    }
    @Test
    public void testMax()    {
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test1.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(100, Main._max(testList));
    }
    @Test
    public void testTime100(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test100.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long start = System.currentTimeMillis();
        Main._min(testList);
        Main._max(testList);
        Main._sum(testList);
        Main._mult(testList);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    @Test
    public void testTime1000(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test1000.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long start = System.currentTimeMillis();
        Main._min(testList);
        Main._max(testList);
        Main._sum(testList);
        Main._mult(testList);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    @Test
    public void testTime10000(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test10000.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long start = System.currentTimeMillis();
        Main._min(testList);
        Main._max(testList);
        Main._sum(testList);
        Main._mult(testList);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Test
    public void testTime100000(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test100000.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long start = System.currentTimeMillis();
        Main._min(testList);
        Main._max(testList);
        Main._sum(testList);
        Main._mult(testList);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Test
    public void testTime1000000(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/test1000000.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long start = System.currentTimeMillis();
        Main._min(testList);
        Main._max(testList);
        Main._sum(testList);
        Main._mult(testList);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Test
    public void test_MultOutOfRange(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/testMultOutOfRange.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0,Main._mult(testList));
    }

    @Test
    public void test_SumOutOfRange(){
        ArrayList<Long> testList = null;
        try {
            testList = Reader("./src/test/resources/testSumOutOfRange.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0,Main._sum(testList));
    }
}

