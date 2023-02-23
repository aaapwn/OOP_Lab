/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return Employee.nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public void eat(Food f){
        energy += f.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if (food instanceof Food){
            eat(food);
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(Employee e){
        return this.getName().equals(e.getName());
    }
    @Override
    public String toString(){
        return "My name is "+getName()+".\nI have "+getEnergy()+
                " energy left.\nI have a balance of "+getWallet().getBalance()+" baht.";
    }
}
