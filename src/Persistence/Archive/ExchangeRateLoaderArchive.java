package Persistence.Archive;

import Model.Currency;
import Model.ExchangeRate;
import Persistence.ExchangeRateLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExchangeRateLoaderArchive implements ExchangeRateLoader{

    private final String FilePathname;

    public ExchangeRateLoaderArchive(String FilePathname) {
        this.FilePathname = FilePathname;
    }
    
    public ExchangeRate getRate(Currency from, Currency to) {
        
        try {
            double from_ToEuro = 0; // incializa a cero
            double to_ToEuro = 0; // incializa a cero
            
            BufferedReader reader = new BufferedReader(new FileReader(new File(this.FilePathname)));
            while (true) {
                String lineText = reader.readLine();
                if (lineText == null) break;
                String[] splitLine = lineText.split(",");
                if (splitLine[0].equals(from.getCode())) {
                    from_ToEuro=Double.parseDouble(splitLine[2]);
                }
                if (splitLine[0].equals(to.getCode())) {
                    to_ToEuro=Double.parseDouble(splitLine[2]);
                }
            }
            double rate = to_ToEuro/from_ToEuro;
            return new ExchangeRate(rate, from, to);
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR" + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
        
        
        return null;
    }
    
}

