package myvehicle;

import calculator.operations;

public class Car extends vehicle {
    public void  increaseMilage(float factor){
        milage= operations.multiplication(milage,factor);
    }
    public void decreaseMilage(float factor){
         milage=operations.division(milage,factor);
    }
    public void addwheels(int wheelstobeincreased) {
        num_of_wheels = (int) operations.sum(num_of_wheels, wheelstobeincreased);

    }
    public void increaseHorsepoiwer(float factor) {
        horsepower= operations.multiplication(horsepower, factor);
    }
    Car(int numwheels,float milage,float horsepower){
        this.num_of_wheels=numwheels;
        this.milage=milage;
        this.horsepower=horsepower;

    }



}
