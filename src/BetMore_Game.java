public class BetMore_Game {
    Shuffle s= new Shuffle();


    public int Play(){
        return s.random;
    }

    public  void Find_Winner (Player Computer, Player Player_2){
        if (Computer.zahl > Player_2.zahl){
            System.out.println("Computer hat gewonnen!");
            System.out.println(Computer.zahl);
            System.out.println(Player_2.zahl);
        }
        else {
            System.out.println("Player_2 hat gewonnen!");
            System.out.println(Computer.zahl);
            System.out.println(Player_2.zahl);

        }
    }
}
