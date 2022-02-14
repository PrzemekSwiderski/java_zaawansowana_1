package dzien3.zadanie3;

import java.util.Comparator;

public class Client2 {

    private int placeInQueue;
    private String name;
    private Integer priority;



    public Client2(int placeInQueue){
        this.placeInQueue = placeInQueue;
    }

    public Client2(int placeInQueue, String name, Integer priority){
        this.placeInQueue = placeInQueue;
        this.name = name;
        this.priority = priority;
    }


    @Override
    public String toString(){
        return name;
    }

    public int getPlaceInQueue() {
        return placeInQueue;
    }

    public void setPlaceInQueue(int placeInQueue) {
        this.placeInQueue = placeInQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}