package com.bootcoding.java;

public class Armstrong {
    public static void main(String[] args) {
        int i=2;
        int a=0;
        int num=0;
        int n=0;
        System.out.println("Armstrong number between 2 to 500: ");
        while(i<500){
            n=i;
            num=0;
            while(n>0){
                a=n%10;
                num=num+(a*a*a);
                n=n/10;
            }
            if (num==i)
                System.out.println(i);
            i++;
        }
    }
}
