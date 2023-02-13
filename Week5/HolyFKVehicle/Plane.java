/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.HolyFKVehicle;

/**
 *
 * @author armmy
 */
public class Plane extends Vehicle{
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is "+super.getFuel()
        +" litre and Top Speed is "+super.getTopSpeed()+" m/s.");
    }
    public void setPlaneInfo(int s, String t){
        super.setFuel(s);
        super.setTopSpeed(t);
    }
    public void fly(){
        if (super.getFuel() >= 200){
            System.out.println("Fly.");
            super.setFuel(super.getFuel()-200);
        }else{
            System.out.println("Please add fuel.");
        }
    }
}
