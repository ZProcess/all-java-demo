package com.sortMethod;

public class Fibonacci {

  public static void main(String[] args) {
    for(int i = 1; i<= 10 ; i++){
      System.out.println(Fibonacci(i));
    }

  }

  public static int Fibonacci(int num){
    if(num == 1){
      return 1;
    }
    if(num ==2){
      return 1;
    }
    return Fibonacci(num-1)+Fibonacci(num-2);
  }

}
