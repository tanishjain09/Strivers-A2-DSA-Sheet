package STEP1.BasicRecursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion{
    //Method using two pointer(variable)
    static void recursion1(int[] arr,int l,int r){
        if(l>=r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        recursion1(arr,l+1,r-1);
    }
    //Method using one pointer(varialble)
    static void recursion2(int[] arr,int key){
        int n =arr.length;
        if(key >= n/2) return;;
        int temp = arr[n-key-1];
        arr[n-key-1] = arr[key];
        arr[key] = temp;
        recursion2(arr,key+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Array before reverse:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after reverse:");
        //recursion1(arr,0,arr.length-1);
        recursion2(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
