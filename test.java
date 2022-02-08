package com.example.democrud.dto;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;
import java.util.*;
public class test {
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
       int arr[]=new int[5];
       for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
       }
        System.out.print(arr);


    }
}
   


