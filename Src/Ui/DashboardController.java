package ui;

import dao.ExpenseDAO;
import dao.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import model.Expense;
import java.util.List;

public class DashboardController {

    private int userId; // Current logged-in user ID
    private ExpenseDAO expenseDAO = new ExpenseDAO();
    private UserDAO userDAO = new UserDAO();

    @FXML
    private BarChart<String, Number> expenseChart;

    public void initialize() {
        // Load user expenses and display on chart
        List<Expense> expenses = expenseDAO.getExpensesByUserId(userId);
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (Expense expense : expenses) {
            series.getData().add(new XYChart.Data<>(expense.getCategory(), expense.getAmount()));
        }
        expenseChart.getData().add(series);
    }

    @FXML
    public void handleAddExpense() {
        // Navigate to Add Expense screen
        AddExpenseController.showAddExpense(userId);
    }

    @FXML
    public void handleUpdateBudget() {
        // Open budget update dialog and update the user’s budget
    }
}
