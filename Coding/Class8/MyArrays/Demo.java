package MyArrays;


/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
    public static void main(String[] args){
        float am[] = new float[7];
        int i;
        System.out.print("\f");
        for(i = 0; i < am.length; i++){
            System.out.print("\n" + am[i]);
        }
    }
    
    public static int findSum(int num[]){
        int sum = 0, i;
        for(i = 0; i < num.length; i++){
            sum += num[i];
        }
        return sum;
    }
}