public class accountTest {
    //Question 1 - 3. 
    public static void main(String[] args) {
        //a)
        account acct1 = new account("1", "Account1", 5000);
        account acct2 = new account("2", "Account2", 4000);

        //b)
        System.out.println("Balance of Account 1: " + acct1.getBalance());
        System.out.println("Balance of Account 2: " + acct2.getBalance());

        //c)
        acct1.transferTo(acct2, 1000);

        //d)
        System.out.println("Balance of Account 1 after the transfer: " + acct1.getBalance());
        System.out.println("Balance of Account 2 after the transfer: " + acct2.getBalance());

    }
}
