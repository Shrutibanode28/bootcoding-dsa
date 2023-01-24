package com.bootcoding.java;

public class EvenDigitsInArray {
    public static void main(String args[]) {
        int nums[] = {555, 901, 483, 1771};
        System.out.println("Even Number: ");
            for (int i = 0; i <= nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    System.out.println(nums[i]);
                }
            }
        }
    }


