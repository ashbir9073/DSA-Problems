import java.util.Scanner;

public class Table {
    public static void main(String[] args){

        System.out.println("Enter table no: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i = 1 ; i <= 10; i++){
            System.out.println( a + " x " + i + " = " + i*a);
        }
    }
}
