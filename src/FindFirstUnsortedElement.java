public class FindFirstUnsortedElement {
    void main(){
        int[] arr = {10,20,30,50,60,40,70,80};
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                System.out.println(arr[i]+" : is the First Unsorted Element in this Array.");
                break;
            }
        }
    }
}
