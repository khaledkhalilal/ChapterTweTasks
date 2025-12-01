package Page_67;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie oen = new Movie("Сорвать куш в Сен-Тропе","Комедии",6.7);
        Movie twe = new Movie("Скалолазы" ,"Ужасы" ,5.5);
        Movie three = new Movie( "Хищник: Миссия «Осирис» ","Боевики",9.8);
        oen.playIt();
        twe.playIt();
        three.playIt();
    }
}
