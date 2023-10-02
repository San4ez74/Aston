import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String enteredName = scanner.nextLine();
        if (enteredName.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}