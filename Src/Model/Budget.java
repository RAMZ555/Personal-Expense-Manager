package model;

public class Budget {
    private int userId;
    private double totalBudget;

    // Constructor
    public Budget(int userId, double totalBudget) {
        this.userId = userId;
        this.totalBudget = totalBudget;
    }

    // Getter and Setter for userId
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter and Setter for totalBudget
    public double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    // Optional: toString method for debugging purposes
    @Override
    public String toString() {
        return "Budget{" +
                "userId=" + userId +
                ", totalBudget=" + totalBudget +
                '}';
    }
}
