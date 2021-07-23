package com.DhivyaRenuka;

public class MovingZeroEndOfArray {
    /*
    given input :{0,1,0,4,12}

    output expected is :
    {
    1,4,12,0,0}

     */
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public void arrayDemo(){
        int[] array = new int[5];

        array[0]=1;
        array[1]=0;
        array[2]=0;
        array[3]=4;
        array[4]=5;
        printArray(array);
        moveZero(array,5);
        printArray(array);
        System.out.println("the size of array existing "+array.length);
        // gonna double the size of existing array
        resize(array,45);
        printArray(array);
        System.out.println("the resized array is"+ array.length);

    }
    public void moveZero(int[] arr, int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j] !=0){
                j++;
            }
        }
    }

    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr= temp;
        return arr;
    }
    public static void main(String[] args) {
        MovingZeroEndOfArray a= new MovingZeroEndOfArray();
        a.arrayDemo();
    }
}
