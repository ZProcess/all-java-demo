package com.sortMethod;

import java.util.Arrays;

public class HeapSort {
  public static void main(String[] args) {
    int[] arr = new int[] { 9,10,2,3,1,7,5,6 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr){
    if(arr.length <= 1){
      return;
    }
    buildMaxHeap(arr);
    //交换首尾元素，重新调整堆
    int len = arr.length;
    while (len > 0 ){
      swap(arr,0,len-1);
      len --;
      adjustHeap(arr,0,len);
    }
  }
  //建立大堆
  public static void buildMaxHeap(int[] array){
    for(int i =(array.length/2 -1); i >=0 ; i--){
      adjustHeap(array,i ,array.length);
    }
    System.out.println(Arrays.toString(array));
  }

  //调整堆
  public static void adjustHeap(int[] array, int i , int len ){
      int maxIndex = i;
      //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
      if(i*2 < len && array[maxIndex] <array[i*2]){
          maxIndex = i*2;
      }
    //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
      if(i*2+1 < len && array[maxIndex] < array[i*2+1]){
            maxIndex = i*2+1;
      }
    //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置
    if(maxIndex != i){
      swap(array,i,maxIndex);
      adjustHeap(array,maxIndex,len);
    }
  }

  public static void  swap(int[] arr , int i ,int j){
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
