package dzien1.oop.polimorphis;

public class ACRemoteController implements RemoteController{
    @Override
    public void enable(boolean enable) {
        if (enable) {
            System.out.println("AC enabled");
        } else {
            System.out.println("AC disabled");
        }
    }
}
