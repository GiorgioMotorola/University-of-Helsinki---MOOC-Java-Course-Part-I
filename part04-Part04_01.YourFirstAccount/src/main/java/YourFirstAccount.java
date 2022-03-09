
public class YourFirstAccount {

    public static void main(String[] args) {
        Account mikeAccount = new Account("Mike's Account", 100.0);
        
       
        System.out.println(mikeAccount);
        
        mikeAccount.deposit(20.0);
        System.out.println(mikeAccount);

    }
}
