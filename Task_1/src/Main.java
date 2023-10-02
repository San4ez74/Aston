import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();
        if (enteredNumber > 7){
            System.out.println("Привет");
        }
    }
}