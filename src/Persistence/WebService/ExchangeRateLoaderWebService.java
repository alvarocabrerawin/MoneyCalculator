package Persistence.WebService;

import Model.Currency;
import Model.ExchangeRate;
import Persistence.ExchangeRateLoader;


public class ExchangeRateLoaderWebService implements ExchangeRateLoader { // implementa ExchangeRateLoader
    private final String url;
    public ExchangeRateLoaderWebService(String url){
        this.url = url;
    }
    
   
    public ExchangeRate getRate(Currency from,Currency to){
        return null;
    }
    
    
}
