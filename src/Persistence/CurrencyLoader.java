package Persistence;
import Model.Currency;
import java.util.List;

// interfaz
public interface CurrencyLoader {
    
    public List<Currency> loadAllCurrencies();
    
    
}
