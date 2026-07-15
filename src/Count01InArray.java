public class Count01InArray {
    void main(){
        int No0 = 0;
        int No1 = 0;
        int [] arr = {1,2,0,1,0,1,3,6,8,0,0,1,4,1,0,1,1,1,1,1,1,1};
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                No0 = No0+1;
            }
            if (arr[i]==1){
                No1 = No1+1;
            }
        }
        System.out.println("Number of 0's in an Array: "+No0);
        System.out.println("Number of 1's in an Array: "+No1);
    }
}
