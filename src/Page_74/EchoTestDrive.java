package Page_74;

public class EchoTestDrive {
    public static void main(String[] args){
        Echo e1 = new Echo();
        Echo e2 =new Echo();

        int x=0;
        while (x < 4){
            e1.hello();
            e1.count= e1.count+1;
            if(x==3){//0
                e2.count=e2.count+1;//1//3
            }
            if(x > 0){//1//3//6
                e2.count=e2.count+ e1.count;//2//6/
            }
            x=x+1;
        }
        System.out.println(e2.count);
    }
}
