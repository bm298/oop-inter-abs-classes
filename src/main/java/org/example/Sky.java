package org.example;

public class Sky extends Environment <Flyable> {

    @Override
    public void checkTraffic() {
        for (Flyable traffic: traffic){
            System.out.println(traffic.getClass().getSimpleName() + " is flying!");
        }
    }
}
