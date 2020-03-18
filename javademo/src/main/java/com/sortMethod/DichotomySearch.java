package com.sortMethod;

public class DichotomySearch {

  public static void main(String[] args) {
    int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
    search(arr,11);
    search(arr,56);
    search(arr,55);
  }
    public static void search(int[] arr , int key){
        int result = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
          int mid = (end+start)/2;
          if(key < arr[mid]){
            end = mid-1;
          }else if(key > arr[mid]){
            start = mid+1;
          }else {
            result = mid;
            break;
          }
        }
      System.out.println(result);
    }
}
