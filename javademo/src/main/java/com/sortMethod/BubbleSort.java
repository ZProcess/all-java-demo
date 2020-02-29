package com.sortMethod;

import java.util.Arrays;


//最佳情况：T(n) = O(n)
//最差情况：T(n) = O(n2)
//平均情况：T(n) = O(n2)
public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = new int[] { 9,10,2,3,1,7,5,6 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr){
    if(arr.length == 0){
      return;
    }
    for(int i = 0 ; i< arr.length ; i++){
      //美一轮冒泡之后，最大数在最后
      for(int j = 0 ; j < arr.length - 1 - i; j ++){
        if(arr[j+1] < arr[j]){
          int tmp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j]= tmp;
        }
      }
    }
  }

}
