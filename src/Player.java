import java.util.Scanner;

public class Player {
    BetMore_Game b=new BetMore_Game();
    int card_number=0;
    boolean user_selected;
    Scanner scanner =new Scanner(System.in);
    int i;
    int speicher;

    public void Start(){
        if (user_selected){
        this.card_number=b.Play();

           /* for (i=0;i<5;i++) {

                speicher = b.Play();
                if (speicher>card_number){
                    card_number=speicher;
                }

            }*/
        }

        else {

             for (i=0;i<5;i++){

                 card_number=b.Play();
                 if (i<4) {
                     System.out.println("Ihr aktuelles Ergebnis ist " + card_number);
                     System.out.println("Wollen sie erneut das Risiko eingehen? Geben sie ja oder nein ein (nein=n)");
                     String s = scanner.next();
                     if (s.equals("nein")||s.equals("n")) {
                         break;
                     }

                 }




             }
             if (i==5){
            System.out.println("Ihr aktuelles Ergebnis ist " + card_number);
             }
        }
    }
}
