
// What is Transpose?Transpose of a matrix is the process of swapping the rows to columns. 
// For a 2x3 matrix,Matrix a11    a12    a13
//                         a21    a22    a23
// Transposed Matrix       a11    a21
//                         a12    a22
//                         a13    a23
public class twodarray7{
    
    
    public static void printtrans(int trans[][]){
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[0].length; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { {11, 12, 13},{ 21, 22, 23}};

        printtrans(matrix);

        int trans[][] = new int[matrix[0].length][matrix.length]; // trans = new int [j][i]
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                trans[j][i] = matrix[i][j];              // trans[j][i] = m[i][j]
            }
        }

        printtrans(trans);
    }
}