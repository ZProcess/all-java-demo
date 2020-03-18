package com.sortMethod;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = new int[] { 6 ,1, 2 ,7, 9, 3, 4, 5, 10, 8};
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr,int low ,int hight){
     if(low > hight){
       return;
     }
     int i = low;
     int j = hight;
     //基准值
     int key = arr[low];
     while (i < j){
       //先从右边看
       while ( key <= arr[j] && i< j ){
         j--;
       }
       while (key >= arr[i] && i<j ){
         i++;
       }

       if( i < j){
         int tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;
       }
     }
     //此时 i = j
    int tmp = arr[low];
    arr[low] = arr[j];
    arr[j] = tmp;

    sort(arr,low,j-1);
    sort(arr,j+1,hight);
  }
}
