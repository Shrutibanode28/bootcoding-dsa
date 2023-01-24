package com.bootcoding.java;

public class DiamondPattern {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=9;i++){   //row (i=1,i=2,.......i=9)
            for(j=9;j>i;j--){   //space (column)
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //reverse of above
        for(i=8;i>=1;i--){   //row
            for(j=9;j>i;j--){   //space (column)
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
