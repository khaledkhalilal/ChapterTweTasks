package Page_68;

public class GuassGame {
    Player p1;
    Player p2;
    Player p3;
    public void StartGame(){
        p1= new Player();
        p2= new Player();
        p3= new Player();

        int GuassP1=0;
        int GuassP2=0;
        int GuassP3=0;

        boolean P1isRight=false;
        boolean P2isRight=false;
        boolean P3isRight=false;

        int targetNumber=(int) (Math.random()*10);
        System.out.println("я загадываю число от 0 до 9.....");
        while (true){
            System.out.println("Число хоторое нужно угадаль : "+ targetNumber );

            p1.Guass();
            p2.Guass();
            p3.Guass();

            GuassP1=p1.number;
            System.out.println("Первые игрок думает что это: " + GuassP1);
            GuassP2=p2.number;
            System.out.println("Второй игрок думает что это: " + GuassP2);
            GuassP3=p3.number;
            System.out.println("Третий игрок думает что это: " + GuassP3);

            if(GuassP1==targetNumber){
              P1isRight=true;
            }
            if(GuassP2==targetNumber){
                P2isRight=true;
            }
            if(GuassP3==targetNumber){
                P3isRight=true;
            }


            if(P1isRight||P2isRight||P3isRight){
                System.out.println("У нас есть победатель !");
                if (P1isRight){
                    System.out.println("Первый - победитель");
                }else if(P2isRight){
                    System.out.println("Второй - победитель");
                }else if(P3isRight){
                    System.out.println("Третий - победитель");
                }
                break;
            }else{
                System.out.println("agen");
            }

        }

    }
}
