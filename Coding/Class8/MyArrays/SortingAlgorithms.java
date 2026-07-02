package MyArrays;


/**
 * Write a description of class SortingAlgos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingAlgorithms
{
    //Sorting array in Ascending order
    public static void bubbleSort(int A[]){
        int i, j, t;
        for(i = 0; i < A.length - 1; i++){
            for(j = 0; j < A.length - 1 - i; j++){
                if(A[j] > A[j+1]){
                    t = A[j];
                    A[j] = A[j+1];
                    A[j+1] = t;
                }
            }
        }
    }
}