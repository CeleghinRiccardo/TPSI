import Exeptions.CodiceFiscaleNonValidoExeptiom;

public class Anagrafe {

    public void addCitizen(String cf){
        try {
            CodiceFiscale cod = new CodiceFiscale("ldksnfòdknf");
            System.out.println(cod+" VALIDO!");
        }catch (CodiceFiscaleNonValidoExeptiom e){
            System.out.println(e.getMessage());
        }
    }
}
