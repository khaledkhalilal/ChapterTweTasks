package Page_66;

public class Dog {
    String name;
    String breed;
    int size;
    Dog(String name, String breed , int size){
        this.name=name;
        this.breed= breed;
        this.size=size;
    }
    Dog(String name, int size){
        this.name=name;
        this.size=size;
    }

    void breek(){
        System.out.println("гав  , гав");
    }

}