package learn;

public class Test {
    public static void main(String[] args) {
        //第一个数值是余额第二个是密码第三个是透支额度
        CheckingAccount ca = new CheckingAccount(30,"123",15);
        Atm.BiBiBi(ca);
    }
}
