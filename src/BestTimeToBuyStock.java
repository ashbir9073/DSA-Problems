public class BestTimeToBuyStock {

    public static void main(String[] args) {

        int[] arr = {7,2,53,4,5,6};

        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[min]) {

                min = i;
                max = i;

                // Find the maximum after the minimum
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] > arr[max]) {
                        max = j;
                    }
                }
            }
        }

        System.out.println("Best time to Buy  : Day " + (min + 1) + " Price " + arr[min]);
        System.out.println("Best time to Sell : Day " + (max + 1) + " Price " + arr[max]);
        System.out.println("Max Profit : " + (arr[max] - arr[min]));
    }
}