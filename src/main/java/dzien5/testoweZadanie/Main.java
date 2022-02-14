package dzien5.testoweZadanie;

public class Main {
    public static void main(String[] args) {
        Wolf.makeWolf();
        Wolf.makeWolf();
        Wolf.makeWolf();

        Wolf.showPack();


        Wolf.getListOfWolfs().get(1).setName("Wojtek");
        System.out.println(Wolf.getListOfWolfs().get(1).getName());

        Wolf.showPack();

        Wolf.getListOfWolfs().remove(2);

        Wolf.showPack();

        Wolf.getListOfWolfs().get(1).makeSound(name -> System.out.println(name + " dał głos: WoofWoof"));








    }
}
