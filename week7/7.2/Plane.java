/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class Plane extends Vehicle implements Flyable{
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    public Plane(double fuel, String airline, String boeing){
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }
    public Plane(){
        this(0, "", "");
    }
    @Override
    public void startEngine(){
        if (getFuel() >= 20){
            setFuel(getFuel()-20);
            System.out.println("Plane's Engine starts");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Plane's Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Weeeeee");
    }
    @Override
    public void fly(){
        if (getFuel() >= 20){
            setFuel(getFuel()-20);
            System.out.println("Plane Fly");
        }else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    @Override
    public void takeOff(){
        if (getFuel() >= 10){
            setFuel(getFuel()-10);
            System.out.println("Plane Already to Take off");
        }else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    @Override
    public void landing(){
        if (getFuel() >= 10){
            setFuel(getFuel()-10);
            System.out.println("Plane Already to Landing");
        }else{
            System.out.println("Fuel is nearly empty.");
        }
    }
}
