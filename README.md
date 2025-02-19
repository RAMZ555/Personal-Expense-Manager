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

## Technologies Used
- **Java**: Backend logic and UI (JavaFX)
- **MySQL**: Database for storing users, expenses, and budgets
- **JavaFX**: For user interface and charts
- **BCrypt**: For password hashing

# Project Structure:

PersonalExpenseManager/
│
├── src/

│   ├── dao/

│   │   ├── BudgetDAO.java
│   │   ├── ExpenseDAO.java
│   │   └── UserDAO.java

│   ├── model/

│   │   ├── Budget.java
│   │   ├── Expense.java
│   │   └── User.java

│   ├── ui/

│   │   ├── MainApp.java
│   │   ├── DashboardController.java
│   │   ├── AddExpenseController.java
│   │   ├── LoginController.java
│   │   ├── RegisterController.java

│   │   └── fxml/

│   │       ├── login.fxml
│   │       ├── dashboard.fxml
│   │       ├── add_expense.fxml
│   │       └── register.fxml

└── resources/
    └── application.properties


## How to Run
1. Clone this repository.
2. Set up a MySQL database and run the provided SQL script to create necessary tables.
3. Configure the database connection in `UserDAO.java`, `ExpenseDAO.java`, and `BudgetDAO.java`.
4. Run `Main.java` to start the application.



## Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/Personal-Expense-Manager.git
cd Personal-Expense-Manager
