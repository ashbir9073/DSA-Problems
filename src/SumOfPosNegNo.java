//Return the sum of positive and negative numbers in an Array elements
public static void main(String[] args) {
    System.out.println("Enter the number of array elements:");
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
    System.out.println("Enter the array elements:");

    for(int i=0; i<n; i++){
        System.out.print("arr["+i+"]=");
        arr[i] = sc.nextInt();
    }
    int positive =0;
    int negative =0;

    for (int i=0; i<n; i++){
        if (arr[i]>0){
            positive = arr[i] + positive;
        }
        if (arr[i]<0){
            negative = arr[i] + negative;
        }
    }
    System.out.println("Positive : "+positive);
    System.out.println("Negative : "+negative);
}