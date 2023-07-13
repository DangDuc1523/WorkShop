/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Dang Duc
 */
public class Car implements Comparable <Car> {
    private String carID;
    private Brand brand;
    private String color;
    private String frameID;
    private String engineID;
    
    public Car(){
        
    }
    public Car(String carID, Brand brand, String color, String frameID, String engineID){
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;    
    }
    public String getCarID(){
        return carID;
    }
    public Brand getBrand(){
        return brand;
    }
    public String getFrameID(){
        return frameID;
    }
    public String getEngineID(){
        return engineID;
    }
 
    public void setUpdatedCar(Brand brand, String color, String frameID, String engineID){
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;  
   }
    public String screenString(){
     return brand + "\n" + carID + "," + color + "," + frameID + "," + engineID;
    }
@Override
 public int compareTo (Car car){
     int val = this.getBrand().getBrandName().compareTo(car.getBrand().getBrandName());
      if (val == 0) {
            val = this.getCarID().compareTo(car.getCarID());
        }
        return val;
 }
    
@Override
  public String toString(){
        return carID + ", " + brand + ", " + color + ", " + frameID + ", " + engineID; 
  }
  
}

