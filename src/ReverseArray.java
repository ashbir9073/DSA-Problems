public class ReverseArray {
    void main(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
