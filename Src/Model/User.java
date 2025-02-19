package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private int id;
    private String username;
    private String passwordHash;
    private double budget;

    // Constructor for new users (with password hashing)
    public User(String username, String password, double budget) {
        this.username = username;
        this.passwordHash = hashPassword(password);
        this.budget = budget;
    }

    // Constructor for existing users (with ID and pre-hashed password)
    public User(int id, String username, String passwordHash, double budget) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public double getBudget() {
        return budget;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    // Password hashing method using SHA-256
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
