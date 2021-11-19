public class Player {
    BetMore_Game b=new BetMore_Game();
    int zahl=0;
    boolean com;

    public void Start(){
        if (com){
        this.zahl=b.Play();
        }

        else {
            for (int i=0;i<5;i++){
                int letztesErgebnis=b.Play();
                if (letztesErgebnis>zahl) {
                    zahl=letztesErgebnis;
                }
            }
        }
    }
}
