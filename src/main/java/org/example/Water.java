package org.example;

public class Water extends Environment <Swimmable> {
    @Override
    public void checkTraffic() {
        for (Swimmable traffic: traffic){
            System.out.println(traffic.getClass().getSimpleName() + " is in water!");
        }
    }
}
