package homeworks.homework05;
import java.util.Scanner;

//Ввод Пользователем Имени 
public class UserView {

    public void displayResult(String result) {
        System.out.println("\nДанные Пользователя:" + result);
        }
   
    public String getUserNameInput() {
    Scanner scannerName = new Scanner(System.in);
    System.out.print("Введите имя Пользователя: ");
    String inputName = scannerName.nextLine();
        return inputName;   
    }

    public String getUserLoginInput() {
    Scanner scannerLogin = new Scanner(System.in);
    System.out.print("Введите Логин: ");
    String inputLogin = scannerLogin.nextLine();
        return inputLogin;
    }

    public String getUserPasswordInput() {
    Scanner scannerPassword = new Scanner(System.in);
    System.out.print("Введите Пароль: ");
    String inputPassword = scannerPassword.nextLine();
        return inputPassword;
    }
}
