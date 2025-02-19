package ui;

import dao.BudgetDAO;
import dao.ExpenseDAO;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import model.Expense;

import java.util.List;

public class DashboardController {

    @FXML
    private PieChart expensePieChart;

    @FXML
    private BarChart<String, Number> expenseBarChart;

    private ExpenseDAO expenseDAO = new ExpenseDAO();
    private BudgetDAO budgetDAO = new BudgetDAO();

    public void initialize() {
        int userId = 1;  // Example userId, replace with actual logged-in user ID

        // Fetch expenses for the current user
        List<Expense> expenses = expenseDAO.getExpensesByUserId(userId);

        // Populate PieChart (Expense Distribution)
        PieChart.Data[] pieData = expenses.stream()
                .map(expense -> new PieChart.Data(expense.getCategory(), expense.getAmount()))
                .toArray(PieChart.Data[]::new);
        expensePieChart.getData().addAll(pieData);

        // Populate BarChart (Detailed Expense Comparison)
        XYChart.Series<String, Number> barSeries = new XYChart.Series<>();
        for (Expense expense : expenses) {
            barSeries.getData().add(new XYChart.Data<>(expense.getCategory(), expense.getAmount()));
        }
        expenseBarChart.getData().add(barSeries);

        // Calculate total expenses and check if the budget is exceeded
        double totalExpenses = expenses.stream().mapToDouble(Expense::getAmount).sum();
        if (budgetDAO.isBudgetExceeded(userId, totalExpenses)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Budget Alert");
            alert.setHeaderText("Budget Exceeded");
            alert.setContentText("Your total expenses have exceeded your budget!");
            alert.showAndWait();
        }
    }
}
