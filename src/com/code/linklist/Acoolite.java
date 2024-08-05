package com.code.linklist;



public class Acoolite {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,1,0,0};
       sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        int i=0;
        int j = arr.length -1;

        while(i<=j){
            if(arr[i]==1){
                swapArray(arr,i,j);
                j--;
            }
            else if(arr[j]==0){
                swapArray(arr,i,j);
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }

    private static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
