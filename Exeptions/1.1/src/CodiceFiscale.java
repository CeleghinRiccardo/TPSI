import Exeptions.CodiceFiscaleNonValidoExeptiom;

public class CodiceFiscale {

    private String cod;
    private final int MAX_LENGHT = 16;

    public CodiceFiscale(String cf)throws CodiceFiscaleNonValidoExeptiom {
        if (cf.length() != MAX_LENGHT) new CodiceFiscaleNonValidoExeptiom("Cf non validp");

        for (int i = 0; i < cf.length(); i++) {
            if (Character.isLetterOrDigit(cf.charAt(i))){
                throw new CodiceFiscaleNonValidoExeptiom("cf non alfanumerico");
            }
        }
        if(!OnlyStatic.isCharUpperCase(cf.charAt(MAX_LENGHT-1))){
            throw new CodiceFiscaleNonValidoExeptiom("CTRL Char non valido");
        }
        this.cod=cf;
    }

    @Override
    public String toString() {
        return cod;
    }
}