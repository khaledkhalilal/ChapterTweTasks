package Page_72;
//java: class, interface, enum, or record expected
public class DvdPlayerTestDrive {
    public static void main(String[] args){
        DvdPlayer d = new DvdPlayer();
        d.canRecord=true;
        d.playTape();
        if(d.canRecord){
            d.recordDvd();
        }
    }
    }

