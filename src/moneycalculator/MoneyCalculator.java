
package moneycalculator;
import Controller.Controller;
import Persistence.Archive.CurrencyLoaderArchive;
import Persistence.Archive.ExchangeRateLoaderArchive;
import Persistence.CurrencyLoader;
import Persistence.ExchangeRateLoader;
import View.swingMoneyDialog;



public class MoneyCalculator {

   
    public static void main(String[] args) {
        
        CurrencyLoader currencyLoader = new CurrencyLoaderArchive("C:\\currency\\currencies.csv"); // directorio
        ExchangeRateLoaderArchive exchangeRateArchive = new ExchangeRateLoaderArchive("C:\\exchangeRate\\exchangeRate.csv"); // directorio
        
        Controller controller = new Controller(exchangeRateArchive); // controller
        swingMoneyDialog dialog = new  swingMoneyDialog(currencyLoader.loadAllCurrencies(), controller);
        controller.setDialog(dialog);
        dialog.setVisible(true);
       
         
    }
    
}
