
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    } // con
    
    public void printBalance() {
        System.out.println(balance);
    } //method 1
    
    public void waitOneYear() {
       this.balance *= interestRate;
        
    } //method 2
    
}  //end
