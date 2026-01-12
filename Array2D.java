package Array_in_java;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Array2D obj = new Array2D();
        obj.array2D();
    }
    Scanner s = new Scanner(System.in);
    void array2D(){
        System.out.println("Enter number of rows:");
        int row = s.nextInt();
        System.out.println("Enter number of columns:");
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements of the array:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Do you want to search for an element? (yes/no): ");
        String choice = s.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter the element to search for:");
            int target = s.nextInt();
            boolean found = false;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(arr[i][j] == target){
                        System.out.println("Element " + target + " found at position (" + i + ", " + j + ")");
                        found = true;
                    }
                }
            }
            if(!found){
                System.out.println("Element " + target + " not found in the array.");
            }
        }
        System.out.println("The sum of elements in the array is: ");
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}

