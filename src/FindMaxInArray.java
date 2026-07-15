import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of array elements:");
        Scanner scanner = new Scanner(System.in);
         int n= scanner.nextInt();

         int[] arr = new int[n];
         for(int i=0;i< n;i++){
             System.out.print("arr[" + i +"]: ");
             Scanner sc = new Scanner(System.in);
             arr[i]= sc.nextInt();
         }

        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in this array : " + max);
    }
}
