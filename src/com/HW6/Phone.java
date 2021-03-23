package com.HW6;

public class Phone {
    public String number;
    public String model;
    public String weight;
    public String name;

    public Phone(){
        number = "undefined";
        model = "undefined";
        weight = "undefined";
    }
    public  Phone(String number, String model){
        this.number = number;
        this.model = model;
        this.weight = "undefined";
    }
    public Phone(String number,String model, String weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall (String name){
    System.out.print("Звонит " + name);
    }

    public String getNumber(){
        return number;
    }
    public void displayInfo(String name){
        System.out.println(name + " номер:"+ number+ " модель:"+ model+ " вес:"+ weight);
    }
}
