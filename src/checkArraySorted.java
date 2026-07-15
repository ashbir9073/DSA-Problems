public class checkArraySorted {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        for(int j=arr.length-1;j>=0;j--){

            if(j == 0){
                System.out.println("true");
                break;
            }
            if(arr[j] < arr[j-1]){
                System.out.println("false");
                break ;
            }

        }
    }
}
