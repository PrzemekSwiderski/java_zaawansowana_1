package dzien3.zadanie1;

public class Main {
    public static void main(String[] args) {
        Chicken kasia = new Chicken("Kasia", ChickenColor.BLACK);
        Chicken asia = new Chicken("Asia", ChickenColor.BLUE);
        Chicken joasia = new Chicken("Joasia", ChickenColor.WHITE);
        Chicken magda = new Chicken("Magda", ChickenColor.BRWON);
        Chicken martyna = new Chicken("Martyna", ChickenColor.WHITE);

        Farm farm = new Farm();

        farm.addChickenToFarm(kasia);
        farm.addChickenToFarm(asia);
        farm.addChickenToFarm(joasia);
        farm.addChickenToFarm(magda);
        farm.addChickenToFarm(martyna);


        farm.showFarm();
        Farm.showGrassland();



        farm.takeOutToPasture(7);


        farm.showFarm();
        Farm.showGrassland();


        farm.takeOutTofarm(10);


        farm.showFarm();
        Farm.showGrassland();
    }
}
