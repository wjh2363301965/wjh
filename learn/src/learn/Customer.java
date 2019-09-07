package learn;
//客户表
public class Customer {
    //姓名
    private String name;
    //是否vip
    private   boolean vip;
    //账户
    private Account account;

    public Customer(String name, boolean vip, Account account) {
        this.name = name;
        this.vip = vip;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
