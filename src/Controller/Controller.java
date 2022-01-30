
package Controller;

import Persistence.Archive.ExchangeRateLoaderArchive;
import Model.*;
import View.swingMoneyDialog;




public class Controller {

    swingMoneyDialog dialog;
    ExchangeRateLoaderArchive exchangeRateArchive;

    
    
    
    public Controller(ExchangeRateLoaderArchive exchangeRateArchive) {
        this.exchangeRateArchive = exchangeRateArchive;
    }
    
    public Controller(swingMoneyDialog dialog, ExchangeRateLoaderArchive exchangeRateArchive) {
        this.dialog = dialog;
        this.exchangeRateArchive = exchangeRateArchive;
    }

    public void setDialog(swingMoneyDialog dialog) {
        this.dialog = dialog;
    }
    
    public void metodo() {
        Money money=dialog.getMoney();
        Currency from=dialog.getCurrencyFrom();
        Currency to=dialog.getCurrencyTo();
        ExchangeRate rate=exchangeRateArchive.getRate(from, to);
        
        
        
        dialog.display(this.convertedResult(money, rate));
    }
    
    
    
    private Money convertedResult(Money money, ExchangeRate rate) {
        return new Money(money.getAmount()*rate.getRate(), rate.getTo());
    }
}
    

