package org.com.entitys;

public class UserBank {

    public UserBank(){}

    public UserBank(int userId, String userName, double userMoney) {
        this.userId = userId;
        this.userName = userName;
        this.userMoney = userMoney;
    }

    private int userId;
    private String userName;
    private double userMoney;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(double userMoney) {
        this.userMoney = userMoney;
    }
}
