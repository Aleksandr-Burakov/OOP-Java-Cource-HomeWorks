package homeworks.homework05;

// public class UserManagementApp {
//   public static void main(String[] args) {
//     UserModel model = new UserModel();
//     UserView view = new UserView();
//     UserPresenter presenter = new UserPresenter(model, view);
//     presenter.onAddUserData();
//   }
// }
import java.util.Scanner;

public class UserManagementApp {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      UserModel model = new UserModel();
      UserView view = new UserView(scanner);
      UserPresenter presenter = new UserPresenter(model, view);
      presenter.onAddUserData();
      scanner.close();
    } 
} 