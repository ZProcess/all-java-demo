package com.sortMethod;

import java.util.Arrays;

//最佳情况：T(n) = O(n)
//最坏情况：T(n) = O(n2)
//平均情况：T(n) = O(n2)
public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = new int[] { 9,10,2,3,1,7,5,6 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr){
    if(arr.length == 0){
      return;
    }
    for(int i = 0 ; i < arr.length -1 ; i++){
      int current = arr[i+1];
      int preIndex = i;
      while (preIndex >= 0 && current < arr[preIndex]){
        arr[preIndex+1] = arr[preIndex];
        preIndex--;
      }
        arr[preIndex+1] = current;
    }
  }
}
