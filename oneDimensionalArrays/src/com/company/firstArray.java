package com.company;

public class firstArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result={
                arr[4],arr[3],arr[2],arr[1],arr[0]
        };
        int arrayLength=result.length;
        for(int i=0; i<arrayLength;i++){
    result[i]=arr[arrayLength-1-i];//4,3,2,1,0

        }
    }
}
