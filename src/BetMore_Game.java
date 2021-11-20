public class BetMore_Game {
    Shuffle s= new Shuffle();


    public int Play(){
        return s.pick_Card();
    }

    public  void Find_Winner (Player Computer, Player Player_2){
        System.out.println("-----------------------------------------------");
        if (Computer.card_number > Player_2.card_number){
            System.out.println("Computer hat gewonnen!");

        }
        else {
            System.out.println("Player_2 hat gewonnen!");


        }
        System.out.println("Der Computer hat die Zahl: " + Computer.card_number);
        System.out.println("Ihre Zahl ist: " + Player_2.card_number);
        System.out.println("-----------------------------------------------");
    }
}
