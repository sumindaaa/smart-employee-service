package com.sumindaa.demo.employeeservice;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SimpleTest {
    @Test
    void test1() {
        int test1 = 1;
        int test2 = 1;
        assertEquals(test1, test2);
    }

    @Test
    void test2() {
        int test1 = 1;
        int test2 = 2;
        assertEquals(test1, test2);
    }

    @Test
    void test3() {
        Random rand = new Random();
        int test1 = 1;

    int test2 = rand.nextInt(2);
        System.out.println(test2);
        assertEquals(test1, test2);
}

}