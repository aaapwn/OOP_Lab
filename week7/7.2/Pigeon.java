/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon += 1;
    }
    public Pigeon(){
        this(0, 0, 0);
    }
    public void eat(String food){
        switch (food) {
            case "worm" -> setWeight(getWeight()+0.5);
            case "seed" -> setWeight(getWeight()+0.2);
            default -> System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    @Override
    public String toString(){
        return "Pigeon "+getWeight()+" kg and "+getHeight()+" cm. There are "
                +Pigeon.numberOfPigeon+" pigeons.";
    }
    @Override
    public void fly(){
        setWeight(getWeight()-0.25);
        if (getWeight() >= 5){
            System.out.println("Fly Fly");
        }else{
            System.out.println("I'm hungry.");
        }
    }
    @Override
    public void takeOff(){
        setWeight(getWeight()-0.5);
        if (getWeight() >= 5){
            System.out.println("Take Off");
        }else{
            System.out.println("I'm hungry.");
        }
    }
    @Override
    public void landing(){
        setWeight(getWeight()-0.5);
        if (getWeight() >= 5){
            System.out.println("Landing");
        }else{
            System.out.println("I'm hungry.");
        }
    }
}
