package org.example;

public class Road extends Environment <Drivable>{
    @Override
        public void checkTraffic() {
            for (Drivable traffic: traffic){
                System.out.println(traffic.getClass().getSimpleName() + " is driving!");
            }
        }
    }
