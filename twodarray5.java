// Question 1 :Print the number of 7’s that are inthe 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
public class twodarray5{
    public static int countnum(int arr[][], int num){
        int count =0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if( arr[i][j] == num){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = { {4,7,8}, {8,8,7}};
        int num = 7;
        System.out.println(countnum(arr, num));
    }
}
