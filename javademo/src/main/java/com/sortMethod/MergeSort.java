package com.sortMethod;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = new int[]{9, 10, 2, 3, 1, 7, 5, 6};
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr, int left , int right ) {

    if(left < right){
      int mid = (left+right)/2;
      sort(arr,left,mid);
      sort(arr,mid+1,right);
      merge(arr,left,mid,right);
    }
  }

  public static void merge(int[] arr,int left,int mid ,int right) {
      int i = left;
      int j = mid+1;
      int t = 0;
      int[] temp = new int[right-left+1];
      //此时两个小组
      while (i <=mid && j <= right){
        if(arr[i] < arr[j]){
          temp[t++] = arr[i++];
        }else {
          temp[t++] = arr[j++];
        }
      }
    //判断当前还有哪个数组元素没有走完；
      while (i<= mid){
        temp[t++] = arr[i++];
      }
      while (j <= right){
        temp[t++] = arr[j++];
      }
    //然后将临时空间中已经合并好的元素拷贝回原数组；
      t = 0;
      while (left <= right){
          arr[left++] = temp[t++];
      }
  }
}
