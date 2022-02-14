package dzien1.oop.polimorphis;

public class Main {
    public static void main(String[] args) {
        RemoteController pilot = new TvRemoteController();
        pilot.enable(true);
        pilot = new ACRemoteController();
        pilot.enable(false);
    }
}
