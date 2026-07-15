
// Find the sum of an array elements
public class Array {
    public static void main(String[] args) {

    int[] arr = {2,4,5,6,7,8,9};
    int sum = 0;

        for(int i=0;i< arr.length;i++){
            sum = sum + arr[i];
        }

            System.out.println(sum);
    }
}

// In method format
    static int arraySum(int[] arr){
    int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};
    System.out.println(arraySum(arr));
    }
