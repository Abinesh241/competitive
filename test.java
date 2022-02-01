package com.example.democrud.dto;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;
import java.util.*;
public class test {
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int k= in.nextInt();
        int count=0;
        for (int i=1;i<=k;i++){
            if (i%k==0){
                count+=1;
            }else{
                continue;
            }
        }
        if(count==2){
            System.out.println("the number you entered is prime");
        }else{
            System.out.println("the number you entered is not prime");
        }
    }
}
   


