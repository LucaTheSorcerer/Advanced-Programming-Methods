package Ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class Ex2 {

    //array with n positive numbers

    //function to sort the array using merge sort

    public static void mergeSort(int[] arr, int l, int r) {

        //exceptions

        if(arr == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }


    }

    public static void merge(int[] arr, int l, int m, int r) {

        //exceptions

        if(arr == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];

        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }

    }

    //find the maximum number from the sorted array using the above merge sort

    public static int returnMaxNumber(int[] arr) {

        //exceptions

        if(arr == null) {
            throw  new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        mergeSort(arr, 0, arr.length - 1);

        return arr[arr.length - 1];
    }

    public static int returnMinNumber(int[] arr) {

        //exceptions

        if(arr == null) {
            throw  new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        mergeSort(arr, 0, arr.length - 1);

        return arr[0];
    }

    //find the maximum sum of biggest n-1 number so exclude the smallest number

    public static int returnMaxSum(int[] arr) {

        //exceptions

        if(arr == null) {
            throw  new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        mergeSort(arr, 0, arr.length - 1);

        int sum = 0;
        int minElement = arr[0];

        for(int num : arr) {
            sum += num;
        }

        return sum - minElement;
    }

    //find the minimum sum of smallest n-1 number so exclude the biggest number

    public static int returnMinSum(int[] arr) {

        //exceptions

        if(arr == null) {
            throw  new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        mergeSort(arr, 0, arr.length - 1);

        int sum = 0;
        int maxElement = arr[arr.length - 1];

        for(int num : arr) {
            sum += num;
        }

        return sum - maxElement;
    }
}
