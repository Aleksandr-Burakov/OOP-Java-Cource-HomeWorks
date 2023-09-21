package homeworks.homework05;

public class UserPresenter {
    private UserModel model;
    private UserView view;

    public UserPresenter(UserModel newModel, UserView view) {
        model = newModel;
        this.view = view;
    }
    public void onAddUserData() {
        String UserName = view.getUserNameInput();
        String UserLogin = view.getUserLoginInput();
        String UserPassword = view.getUserPasswordInput();

        model.add(UserName, UserLogin, UserPassword);
        String result = model.getResult();
        
        view.displayResult(result);
        }
        }
   
         
     