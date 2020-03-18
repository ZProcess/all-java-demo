package com.sortMethod;

import java.util.Arrays;

public class CountingSort {

  public static void main(String[] args) {
    int[] arr = new int[] { 9,10,2,3,1,7,5,6 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void sort(int[] arr){
    if(arr.length == 0){
      return;
    }
    //找出元素最大值
    int max = arr[0], min = arr[0];
    for(int i = 1;i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
      if(arr[i] > max){
        max = arr[i];
      }
    }
    int bias = 0 - min;
    int[] buket = new int[max - min +1];
    for(int i = 0 ; i < arr.length ; i++){
      buket[arr[i]+bias]++;
    }
    int index = 0 , i = 0;
    while (index < arr.length){
      if(buket[i] != 0){
        arr[index] = i - bias;
        buket[i]--;
        index ++;
      }else {
        i ++;
      }
    }
  }
}
