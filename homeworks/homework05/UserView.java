package homeworks.homework05;
import java.util.Scanner;
//Ввод Пользователем Имени 
public class UserView {
    public UserView(Scanner scanner) {
            this.scanner = scanner;
            
        }
        
    public void displayResult(String result) {
        System.out.println("\n Данные Пользователя:" + result);
        }
    Scanner scanner = new Scanner(System.in);
    public String getUserNameInput() {
        System.out.print("Введите имя Пользователя: ");
        String inputName = scanner.nextLine();
        return inputName;
    }

    public String getUserLoginInput() {
        System.out.print("Введите Логин: ");
        String inputLogin = scanner.nextLine();
        return inputLogin;
    }
    
    public String getUserPasswordInput() {
        System.out.print("Введите Пароль: ");
        String inputPassword = scanner.nextLine();
        return inputPassword;    
    } 
} 
