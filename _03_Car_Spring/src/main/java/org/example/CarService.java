package org.example;

public class CarService {

    private IEngine iEngine;

    public CarService(IEngine iEngine) {
        this.iEngine = iEngine;
    }

    public  void setIEngine(IEngine iEngine){
        this.iEngine = iEngine;
    }
     public  void driveCar(){
        int status = iEngine.startEngine();
        if(status >=1){
            System.out.println("Car is Driving ......");
        }else {
            System.out.println("Car engine is failed..........");
        }
     }
}
