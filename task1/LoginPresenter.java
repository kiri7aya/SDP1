public class LoginPresenter {
    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    public void handleLogin() {
        UserCredentials user = new UserCredentials(view.getUsername(), view.getPassword());

        if (user.isValid()) {
            view.showMessage("Login successful");
        } else {
            view.showMessage("Please enter valid credentials");
        }
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginViewImpl();
        new LoginPresenter(loginView);
    }
}
