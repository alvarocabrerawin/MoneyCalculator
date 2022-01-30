package Model;

public class Money {
    private final double amount;
    private final Currency currency;
    
    public Money(double amount,Currency currency){
        this.amount = amount;
        this.currency = currency;
        
        //getter
    } 
    public double getAmount(){
        return amount;
    }
    
    public Currency getCurrency(){
        return currency;
    }
    
    
     @Override
    public String toString() {
        return "  " + this.amount;
    }
    
    
}
