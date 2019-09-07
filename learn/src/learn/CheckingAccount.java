package learn;
//信用卡类
public class CheckingAccount extends Account {
    //透支额度
    private double protection;

    public CheckingAccount(double balance, String password, double protection) {
        super(balance, password);
        this.protection = protection;
    }


}
