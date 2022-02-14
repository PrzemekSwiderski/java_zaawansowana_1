package dzien5.funcional;

public class Console implements Playable{
    @Override
    public void play(String userName) {
        System.out.println(userName + " gra w grę.");
    }
}
