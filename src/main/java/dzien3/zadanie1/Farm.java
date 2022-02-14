package dzien3.zadanie1;

import java.util.Stack;

public class Farm {
    private Stack<Chicken> farm = new Stack<>();
    private static Stack<Chicken> grassland = new Stack<>();

    public void addChickenToFarm(Chicken chicken) {
        farm.push(chicken);
    }

    public void takeOutToPasture(int n) {
        for (int i = 0; i < n; i++) {
            if (farm.isEmpty()) {
                System.out.println("Za mało kurczaków na farmie");
                break;
            } else {
                grassland.push(farm.pop());
            }

        }
    }

    public void takeOutTofarm(int n) {
        for (int i = 0; i < n; i++) {
            if (grassland.isEmpty()) {
                System.out.println("Za mało kurczaków na pastwisku");
                break;
            } else {
                farm.push(grassland.pop());
            }
        }
    }

    public static void showGrassland() {
        System.out.print("Pastwistko: ");
        System.out.println(grassland);
    }

    public void showFarm() {
        System.out.print("Farma: ");
        System.out.println(farm);
    }


}
