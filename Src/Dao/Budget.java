package dao;

import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BudgetDAO {
    public boolean isBudgetExceeded(int userId, double totalExpenses) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT budget FROM budgets WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                double budget = rs.getDouble("budget");
                return totalExpenses > budget;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateBudget(int userId, double newBudget) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "UPDATE budgets SET budget = ? WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, newBudget);
            stmt.setInt(2, userId);
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
