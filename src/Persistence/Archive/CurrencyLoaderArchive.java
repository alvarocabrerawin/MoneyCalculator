package Persistence.Archive;
import Model.Currency;
import Persistence.CurrencyLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CurrencyLoaderArchive implements CurrencyLoader {
    private final String filePathName;
    
    public CurrencyLoaderArchive(String filePathName){
        this.filePathName = filePathName;
    }
    private Currency currencyOf(String lineText){
        String[] splitedLine = lineText.split(",");
        return new Currency(splitedLine[0],splitedLine[1],splitedLine[2]);
    }
    @Override
    public List<Currency> loadAllCurrencies(){
        List<Currency> listCurrency = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(filePathName)));
            while(true){
                String lineText = reader.readLine();
                if(lineText == null) break;
                listCurrency.add(currencyOf(lineText));
                    
                
            }
            
            
        }
        catch(FileNotFoundException exception){
            System.out.println("ERROR" + exception.getMessage());
        }
        
       catch(IOException exception){
           System.out.println("ERROR" + exception.getMessage());
       }
       return listCurrency;
    
}
    
}
    


