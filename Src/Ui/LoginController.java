package ui;

import dao.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User;
import util.PasswordUtil;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private UserDAO userDAO = new UserDAO();

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        User user = userDAO.getUserByUsername(username);
        if (user != null && PasswordUtil.verifyPassword(password, user.getPasswordHash())) {
            // Successful login, open dashboard
            Stage stage = (Stage) usernameField.getScene().getWindow();
            // Load the dashboard scene (not shown here, but follow same process as login)
        } else {
            // Handle incorrect login
        }
    }

    @FXML
    public void openRegister() {
        // Load register screen
    }
}
