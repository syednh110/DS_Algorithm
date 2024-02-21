package com.code.recursion;

public class SortArray {
    public void getSortedArray(int[] arr, int n){
        if(n>0){
            for(int i=0;i<n;i++){
                if(arr[i]>arr[n-1])
                    swap(arr,i,n-1);
            }
            getSortedArray(arr,n-1);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
