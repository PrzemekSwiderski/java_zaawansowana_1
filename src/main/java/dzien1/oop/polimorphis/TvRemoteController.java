package dzien1.oop.polimorphis;

public class TvRemoteController implements RemoteController {
    @Override
    public void enable(boolean enable) {
        if (enable) {
            System.out.println("Tv enabled");
        } else {
            System.out.println("Tv disabled");
        }

    }
}
