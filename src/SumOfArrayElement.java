import java.util.Scanner;
public class SumOfArrayElement {
    void main(){
        System.out.print("Enter the Size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print(i+" :");
            arr[i] = scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum Of array Elements: "+sum);
    }
}
