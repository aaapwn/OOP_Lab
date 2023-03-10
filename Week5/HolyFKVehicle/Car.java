/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.HolyFKVehicle;

/**
 *
 * @author armmy
 */
public class Car extends Vehicle{
    private String typeEngine;
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void showCarInfo(){
        System.out.println("Car engine is "+typeEngine+".");
        System.out.println("Fuel is "+super.getFuel()+" litre and Top Speed is "+super.getTopSpeed()+" m/s.");
    }
    public void setCarInfo(int s, String t, String y){
        super.setFuel(s);
        super.setTopSpeed(t);
        typeEngine = y;
    }
    public void move(){
        if (super.getFuel() >= 50){
            System.out.println("Move.");
            super.setFuel(super.getFuel()-50);
        }else{
            System.out.println("Please add fuel.");
        }
    }
}
