package com.company;

import java.util.Scanner;
public class Main {
    public static void main( String [] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("ENTER A NUMBER");
        float x= a.nextFloat();
        Scanner b= new Scanner(System.in);
        System.out.print("ENTER A NUMBER");        float y=b.nextFloat();

        float Sum=x + y;
        float Sub= x-y;
        float Multi=x*y;
        float Divi=x/y;
        System.out.println(Sum);
        System.out.println(Divi);
        System.out.println(Multi);
        System.out.println(Divi);   }
}
