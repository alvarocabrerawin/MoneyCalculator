package Model;

public class ExchangeRate {
    private final double rate;
    private final Currency from;
    private final Currency to;
    
    public ExchangeRate(double rate,Currency from,Currency to){
        this.rate = rate;
        this.from = from;
        this.to = to;
    }

    public ExchangeRate(Money money, Currency toCurrency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getRate(){
        return rate;
    }
    
    public Currency getFrom(){
        return from;
    }
    
    public Currency getTo(){
        return to;
    }
    
}
