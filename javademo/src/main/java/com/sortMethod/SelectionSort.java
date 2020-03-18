package com.sortMethod;


import java.util.Arrays;


//最佳情况：T(n) = O(n2)
//最差情况：T(n) = O(n2)
//平均情况：T(n) = O(n2)
public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = new int[]{9, 10, 2, 3, 1, 7, 5, 6};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    if (arr.length == 0) {
      return;
    }
    for(int i = 0 ; i < arr.length ; i++){
      for(int j = i+1 ;j < arr.length;j++){
        if(arr[i] > arr[j]){
          int tmp = arr[j];
          arr[j] = arr[i];
          arr[i] = tmp;
        }
      }
    }
  }
}
