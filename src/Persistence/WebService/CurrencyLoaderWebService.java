package Persistence.WebService;

import Model.Currency;
import Persistence.CurrencyLoader;
import java.util.List;


public class CurrencyLoaderWebService implements CurrencyLoader { // implementa CurrencyLoader
    private final String url;
    public CurrencyLoaderWebService(String url){
        this.url = url;     
    }
    @Override
    public List<Currency> loadAllCurrencies(){
        return null;
    }
    
    
}
