public class ThreeGreatCandidatesArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int Max1=0; int Max2=0; int Max3 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max1){
                Max1 = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max2 && arr[i]<Max1){
                Max2 = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i] > Max3 && arr[i] < Max2){
                    Max3 = arr[i];
            }
        }

        System.out.println("Highest: "+Max1);
        System.out.println("Mid-High: "+Max2);
        System.out.println("Low-High: "+Max3);
    }
}
