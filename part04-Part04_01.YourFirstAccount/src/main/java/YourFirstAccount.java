
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account bransAccount = new Account("Bran's account", 100.0);
        bransAccount.deposit(20.0);

        System.out.println(bransAccount.toString());
    }
}
