package clientwsfootball;

import java.util.List;

public class ClientWsFootball {

    public static void main(String[] args) {
        System.out.println("Yellow card's total: " + yellowCardsTotal());
        System.out.println("Defend players: " + allDefenders("spain").getString());
        
        List<TCountryInfo> listCountry = countryNames(true).getTCountryInfo();
        for (TCountryInfo listCountry1 : listCountry) {
            System.out.println(listCountry1.getSName()); 
            String country = listCountry1.getSName();
            System.out.println(allDefenders(country).getString());
        }
    }

    private static int yellowCardsTotal() {
        clientwsfootball.Info service = new clientwsfootball.Info();
        clientwsfootball.InfoSoapType port = service.getInfoSoap12();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        clientwsfootball.Info service = new clientwsfootball.Info();
        clientwsfootball.InfoSoapType port = service.getInfoSoap12();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        clientwsfootball.Info service = new clientwsfootball.Info();
        clientwsfootball.InfoSoapType port = service.getInfoSoap12();
        return port.countryNames(bWithCompetitors);
    }
    
    
    
}
