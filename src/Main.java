import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите логин: ");
        String login = scanner.nextLine();


        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();


        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();


        boolean result = CredentialsValidator.validateCredentials(login, password, confirmPassword);
        System.out.println("Результат проверки: " + (result ? "Успешно" : "Ошибка"));

        scanner.close();
    }
}