package dzien8.refleksje;

public class Car extends  Vehicle{
    private String model;
    private int productionYear;

    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car() {
    }

    void drive(){
        System.out.println("kieruję " );
    }


    public void getModel() {
        System.out.println("test");
    }

    public void setModel() {

    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear() {

    }
}
