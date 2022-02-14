package dzien5.funcional;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//        Watchable<String> watchable = new Watchable<String>() {
//            @Override
//            public void display(String objectToDisplay) {
//                System.out.println(objectToDisplay);
//            }
//        };
//
//        Watchable<String> watchable2 = objectToDisplay -> System.out.println(objectToDisplay);
//
//
//        watchable.display("Jakiś film");
//        watchable2.display("Inny film");
//
//
//        Predicate<String> predicate = napis -> napis.equals("hej");
//        System.out.println(predicate.test("hel"));
//
//        Notebook book = null;
//        Optional<Notebook> optionalBook = Optional.ofNullable(book);
//        optionalBook.ifPresent((b) -> System.out.println(b.toString()));
//


        Notebook book = new Notebook();
        book.someMethod(new Console());
        book.someMethod(new Playable() {
            @Override
            public void play(String userName) {
                System.out.println(userName + " gra w grę.");
            }
        });
        book.someMethod(userName -> System.out.println(userName + " grał w grę"));

    }


}
