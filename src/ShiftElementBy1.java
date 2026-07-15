public class ShiftElementBy1 {
    void main(){
        int[] arr = new int[10];
        int size =  arr.length;
        int start =0;
        System.out.print("Array Before Shifting: ");
        for(int i = 0; i < size; i++){
            arr[i] = i+1;
            System.out.print((arr[i])+"|");
        }

        for(int i=size-1;i > start; i--){
            arr[i] = arr[i-1];
        }

        arr[start] = 10;

        System.out.println();
        System.out.print("Array After Shifting: ");
        for(int i = 0; i < size; i++){
            System.out.print((arr[i])+"|");
        }
    }
}
