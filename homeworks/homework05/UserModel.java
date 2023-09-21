package homeworks.homework05;

//Бизнесс логика.
public class UserModel {
    private String result;

    public void add(String name, String login, String password) { 

        result = String.format("\n\n Имя пользователя: %s\n Логин: %s\n Пароль: %s", name, login, password);
      
    }
    public String getResult() {
        return result;
    }
}