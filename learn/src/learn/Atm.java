package learn;

import java.util.Scanner;

public class Atm {


    //取款机哔哔
    public static void BiBiBi(Account account) {
        //请输入密码
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入密码，你有"+i+"次机会");
            Scanner scanner = new Scanner(System.in);
            String mima = scanner.next();
            System.out.println(mima);
            System.out.println(account.getPassword());
            if (mima.equals(account.getPassword()) ){

                System.out.println("密码输入正确");
                break;
            }else {
                System.out.println("密码输入错误");
                if (i ==1){
                    System.out.println("三次输入错误，系统死机");
                    return;
                }
                continue;
            }
        }


        while (true) {
            System.out.println("请输入命令 （1：退出程序 2：取款 3：存款 其他：爆炸）");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 3) {
                //代表要退出程序
                return;
            }else if (i ==2){
                //代表要取款
                System.out.println("请输入金额");
                Scanner sc = new Scanner(System.in);
                double qv = sc.nextDouble();
                if ( account.withdraw(qv)){
                    System.out.println("您的余款为"+account.getBalance());
                }else {
                    System.out.println("您的余额不足");
                }
            }else if (i == 1){
                //代表要存款
                System.out.println("请输入金额");
                Scanner sc = new Scanner(System.in);
                double cun = sc.nextDouble();
                account.deposit(cun);
                System.out.println("您的余额为"+account.getBalance());

            }else {
                System.out.println("机器爆炸");
                return;
            }




        }
    }
}
