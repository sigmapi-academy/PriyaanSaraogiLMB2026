package MyArrays;
import java.util.*;


/**
 * Write a description of class ArrayUtility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayUtility
{
    public static void printArray(int A[], String msg){
        System.out.print("\n" + msg + "\n[");
        int i;
        for(i = 0; i < A.length - 1; i++){
            System.out.print(A[i]+", ");
        }
        System.out.print(A[i] + "]\n");
    }
    
    public static void inputArray(int A[], String msg){
        System.out.print("\n" + msg + "\n");
        int i;
        Scanner sc = new Scanner(System.in);
        for(i = 0; i < A.length; i++){
            System.out.print("["+i+"]: ");
            A[i] = sc.nextInt();
        }
        
    }
}