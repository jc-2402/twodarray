
import java.util.*;

//creation, i/p , o/p and search
public class twodarray1{
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void  searchlargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("largest is "+largest);
        System.out.println("smallest is "+smallest);
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        //i/p
        Scanner s = new Scanner(System.in);
        System.out.println("enter the matrix data");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        //o/p
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter key");
        int key = s.nextInt();
        search(matrix,key);
        searchlargest(matrix);
    }
}