package ui;

import dao.ExpenseDAO;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Expense;
import java.sql.Date;

public class AddExpenseController {

    private int userId;
    private ExpenseDAO expenseDAO = new ExpenseDAO();

    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private TextField amountField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField descriptionField;

    @FXML
    public void handleAddExpense() {
        Expense expense = new Expense();
        expense.setUserId(userId);
        expense.setCategory(categoryComboBox.getValue());
        expense.setAmount(Double.parseDouble(amountField.getText()));
        expense.setDate(Date.valueOf(datePicker.getValue()));
        expense.setDescription(descriptionField.getText());

        if (expenseDAO.addExpense(expense)) {
            // Close Add Expense window and refresh dashboard
        }
    }

    public static void showAddExpense(int userId) {
        // Code to display Add Expense screen
    }
}
