package myvehicle;
public class customevehicle {
     public static void main(String[] args) {
         //for car
         Car C=new Car(4,3,30);
         System.out.println("Car intial readings-- number of wheels:"+ C.num_of_wheels+", milage: "+C.milage+", horsepower: "+C.horsepower);
         C.increaseMilage(3);
         C.num_of_wheels=4;
         C.increaseHorsepoiwer(4);
         System.out.println("Car final readings-- number of wheels:"+ C.num_of_wheels+", milage: "+C.milage+", horsepower: "+C.horsepower);
         //for bike
         Bike B=new Bike(2,55,43);
         System.out.println("Bike intial readings-- number of wheels:"+ B.num_of_wheels+", milage: "+B.milage+", horsepower: "+B.horsepower);

         B.increaseMilage(2);
         B.num_of_wheels=2;
         B.increaseHorsepoiwer(2);
         System.out.println("Bike final readings-- number of wheels:"+ B.num_of_wheels+", milage: "+B.milage+", horsepower: "+B.horsepower);}




    }

