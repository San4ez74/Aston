import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество цифр: ");
        int size = scan.nextInt();
        int[] massive = new int[size];
        System.out.println("Введите числа нажимая Enter:");
        for (int i = 0; i < size; i++) {
            massive[i] = scan.nextInt();
        }
        System.out.println("Вывод чисел кратных 3: ");
        for (int i = 0; i < size; i++) {
            if (massive[i] % 3 == 0) {
                System.out.println(massive[i]);
            }
        }
    }
}