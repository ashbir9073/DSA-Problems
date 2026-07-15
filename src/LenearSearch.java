public class LenearSearch {
    static boolean SearchArray(int[] arr , int target){
        for(int i =0 ; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        boolean ans = SearchArray(arr,2);
        System.out.println(ans);
    }
}
