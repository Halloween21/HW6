import java.util.Scanner;

public class Player {
    BetMore_Game b=new BetMore_Game();
    int card_number=0;
    boolean user_selected;
    Scanner scanner =new Scanner(System.in);
    int i;

    public void Start(){
        if (user_selected){
        this.card_number=b.Play();
        }

        else {

             for (i=0;i<5;i++){

                 card_number=b.Play();
                 if (i<4) {
                     System.out.println("Ihr aktuelles Ergebnis ist " + card_number);
                     System.out.println("Wollen sie erneut das Risiko eingehen? Geben sie ja oder nein ein");
                     String s = scanner.next();
                     if (s.equals("nein") || s.equals("Nein")) {
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
