
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        boolean isValid = false;
        if (amount <= this.balance) {
            this.balance -= amount;
            isValid = true;
        }
            return isValid;
        
    }
}
