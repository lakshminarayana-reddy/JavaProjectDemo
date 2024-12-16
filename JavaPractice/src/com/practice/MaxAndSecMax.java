package com.practice;

import java.util.*;

public class MaxAndSecMax {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Scanner sc = new Scanner(System.in);
      int arrLen= sc.nextInt();
      int num[]=new int[arrLen];
      for(int i=0; i<arrLen; i++){
        num[i]=sc.nextInt();
      }
      int max=num[0];
      int secMax=num[0];
      for(int i=1; i<arrLen; i++){
        if(num[i]>max){
          secMax=max;
          max=num[i];
        }else if(num[i]>secMax){
          secMax=num[i];
        }
      }
      System.out.println(max);
      System.out.println(secMax);
  }
}