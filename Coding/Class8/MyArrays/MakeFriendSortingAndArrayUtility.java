package MyArrays;
import java.util.*;


/**
 * Write a description of class MakeFriendSortingAndArrayUtility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MakeFriendSortingAndArrayUtility
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A[], size;
        System.out.print("\fEnter number of elements: ");
        size = sc.nextInt();
        A = new int[size];
        ArrayUtility.inputArray(A, "Enter " + size + " eelemnts in A[]: ");
        ArrayUtility.printArray(A, "Array A[] before sorting: ");
        SortingAlgorithms.bubbleSort(A);
        ArrayUtility.printArray(A, "Array A[] after sorting: ");
    }
}