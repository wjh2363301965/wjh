package learn;

//账户表
public class Account {
    //账户余额
    private double balance;
    //账户密码
    private String Password;

    public Account(double balance, String password) {
        this.balance = balance;
        Password = password;
    }

    public double getBalance() {
        return balance;
    }


    public String getPassword() {
        return Password;
    }


    //取款方法
    public boolean withdraw(double amt) {
        if (amt > balance) {

            return false;
        } else {
            balance = balance-amt;
            return true;
        }
    }

    //存款方法
    public void deposit(double amt) {
            balance=balance+amt;
    }

}
