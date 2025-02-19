package ui;

import dao.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;
import util.PasswordUtil;

public class RegisterController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField budgetField;

    private UserDAO userDAO = new UserDAO();

    @FXML
    public void handleRegister() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        double budget = Double.parseDouble(budgetField.getText());

        // Hash the password before storing
        String passwordHash = PasswordUtil.hashPassword(password);
        User user = new User(username, passwordHash, budget);

        userDAO.saveUser(user);
    }
}
