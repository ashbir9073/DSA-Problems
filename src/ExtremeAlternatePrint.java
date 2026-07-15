public class ExtremeAlternatePrint {
    void main() {
        int[] arr = {1, 2, 3, 4, 5, 6,7};
        int i = 0;
        int size = arr.length;
        int j = size-1;

        while(i<j){
            System.out.print(arr[i]+", ");
            System.out.print(arr[j]+", ");
            i++;
            j--;
        }
        if(i==j){
            System.out.print(arr[j]+" ");
        }
    }
}
