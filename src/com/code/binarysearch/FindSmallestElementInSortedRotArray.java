package com.code.binarysearch;

public class FindSmallestElementInSortedRotArray {
    public static void main(String[] args) {
        int[] arrays = {4,5,7,9,1,2,3};
        System.out.println(findSmallestElement(arrays));
    }

    private static int findSmallestElement(int[] arrays) {
        if(arrays[0]<arrays[arrays.length-1])
            return arrays[0];
        int mid;
        int low = 0;
        int high = arrays.length-1;
        while(low<=high){
            mid = low+ (high-low)/2;
            if(arrays[low]<arrays[high])
                return arrays[low];
            else if(arrays[mid]<=arrays[mid-1] && arrays[mid]<=arrays[mid+1])
                return arrays[mid];
            else if(arrays[low]<=arrays[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

}
