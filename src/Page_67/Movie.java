package Page_67;

public class Movie {
    String title;
    String genre;
    double rating;
    Movie(String title,String genre, double rating){
        this.title=title;
        this.genre=genre;
        this.rating=rating;
    }
    void playIt(){
        System.out.println("Title movie: "+ title);
        System.out.println("genre: "+ genre);
        System.out.println("rating: "+ rating);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }

}
