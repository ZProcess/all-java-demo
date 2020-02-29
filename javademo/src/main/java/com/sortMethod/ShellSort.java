package com.sortMethod;

import java.util.Arrays;

//最佳情况：T(n) = O(nlog2 n)
//最坏情况：T(n) = O(nlog2 n)
//平均情况：T(n) = O(nlog2n)
public class ShellSort {
  public static void main(String[] args) {
    int[] arr = new int[]{9, 10, 2, 3, 1, 7, 5, 6};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    if (arr.length == 0) {
      return;
    }
    int len = arr.length;
    int tmp, gap = len/2;
    while (gap>0){
      for(int i = gap ; i< len ; i++){
        int current = arr[i];
        int preIndex = i-gap;
        while (preIndex >=0 && current < arr[preIndex] ){
          arr[preIndex+gap] = arr[preIndex];
          preIndex -= gap;
        }
        arr[preIndex+gap] = current;
      }
      gap /= 2;
    }

  }
}
