import javax.swing.text.Utilities;

import static javax.swing.JOptionPane.*;

public class UnikeTall {

    int [] tilfeldigTall;

    public UnikeTall(int tilfeldigTall) {
        this.tilfeldigTall = new int[tilfeldigTall];
    }

     private boolean test(int finnTall){
         for (int i = 0; i < tilfeldigTall.length; i++){
             if (tilfeldigTall[i] == finnTall){
                 return true;
             }
         }
         return false;
     }

     public void arrayListe(int arrayListe){
         int hentTall = (int)(Math.random()*(900)+100);
         for (int i = 0; i < tilfeldigTall.length; i++){
             while (test (hentTall)){
                 hentTall = (int)(Math.random()*(900)+100);
             }
             tilfeldigTall[i] = hentTall;
         }
         for (int i = 0; i < tilfeldigTall.length; i++){
         }
     }

    public static int finnMinsteTall(int [] tilfeldigTall){
        int minsteTall = tilfeldigTall[0];
        for (int i = 0; i < tilfeldigTall.length; i++){
            if (tilfeldigTall[i] < minsteTall){
                minsteTall = tilfeldigTall[i];
            }
        }
        return minsteTall;
    }

    public static int finnStørsteTall(int [] tilfeldigTall){
        int størsteTall = tilfeldigTall[0];
        for (int i = 0; i < tilfeldigTall.length; i++){
            if (tilfeldigTall[i] < størsteTall){
                størsteTall = tilfeldigTall[i];
            }
        }
        return størsteTall;
    }

    public void Gjennomsnitt (){
        int sum = 0;
        for (int i = 0; i < tilfeldigTall.length; i++){
            sum += tilfeldigTall[i];
        }
        double Gjennomsnitt = (double) sum/ tilfeldigTall.length;
    }

    public void visMelding(){
        showMessageDialog(null, "Det minste tallet er: "+ finnMinsteTall(tilfeldigTall) +"\n"+
                            "Det største taller er: " + "\n"+
                            "Gjennomsnittet er: ");
    }

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */




   public static void main(String []args){
        UnikeTall nyListe = new UnikeTall(0);
        nyListe.visMelding();
   }
}


