# Personal Expense Manager (PEM)

# Project Overview
The Personal Expense Manager (PEM) is a Java-based desktop application designed to help users efficiently manage their personal finances. It includes features like secure user authentication, expense categorization, budget tracking, and real-time data visualization using JavaFX charts. The application is backed by a MySQL database for storing user data and expenses securely.

# Project Features:

Secure User Authentication:

User login and registration system with password hashing using SHA-256 to securely store passwords.

Expense Management:

Users can add, categorize, and track expenses with descriptions, dates, and amounts.

Budget Tracking:

Allows users to set a budget and compare their total expenses against it to monitor overspending.

Real-Time Data Visualization:

Provides bar charts using JavaFX to visualize expenses by category for easy tracking.

MySQL Integration:

Stores user information and expenses securely in a MySQL database.

User Interface:

A simple and intuitive GUI built using JavaFX.

# Project Structure:


pgsql
Copy
Edit
Personal-Expense-Manager/
│
├── src/
│   ├── model/
│   │   ├── User.java
│   │   ├── Expense.java
│   ├── dao/
│   │   ├── UserDAO.java
│   │   ├── ExpenseDAO.java
│   ├── utils/
│   │   ├── DBConnection.java
│   ├── ui/
│   │   ├── Main.java
│   │   ├── ExpenseChart.java
│   │   ├── LoginController.java
│   │   ├── DashboardController.java
│   │   ├── AddExpenseController.java
│   ├── resources/
│   │   ├── login.fxml
│   │   ├── dashboard.fxml
│   │   ├── addExpense.fxml
│
├── db/
│   ├── create_tables.sql  (SQL script for creating tables)
│
├── pom.xml  (Maven dependencies)
└── README.md  (GitHub README file)

## Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/Personal-Expense-Manager.git
cd Personal-Expense-Manager
