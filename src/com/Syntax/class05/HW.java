package com.Syntax.class05;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class HW {

        /*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
        and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class
         Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
          Using for loop/advanced for loop/ iterator access all methods of the class.
*/
        public static void main(String[] args) {
            Insurance carIns=new Car("Tesla","StateFarm");
            Insurance petIns=new Pet("Dog","Allstate");
            Insurance healthIns=new Health("Mutual");

            ArrayList<Insurance> insuranceArrayList=new ArrayList<>();
            insuranceArrayList.add(carIns);
            insuranceArrayList.add(petIns);
            insuranceArrayList.add(healthIns);
            for(Insurance insurance:insuranceArrayList){
                insurance.getQuote();
                insurance.cancelInsurance();
            }

        }
    }
    abstract class Insurance{
String insuranceName;
Insurance(String insuranceName){
    this.insuranceName=insuranceName;
}
abstract void getQuote();
abstract void cancelInsurance();
    }
    class Car extends Insurance{
    String carModel;

    Car(String carModel,String insuranceName){
        super(insuranceName);
        this.carModel=carModel;
    }

        @Override
        void getQuote() {
            System.out.println(insuranceName+" sent your quote for the car");
        }

        @Override
        void cancelInsurance() {
            System.out.println(insuranceName+" canceled your insurance for "+carModel);
        }
    }
class Pet extends Insurance{
    String petType;

    Pet(String petType, String insuranceName){
        super(insuranceName);
        this.petType=petType;
    }
    void getQuote(){
        System.out.println(insuranceName+" qoute for your "+petType);
    }
    void cancelInsurance(){
        System.out.println(insuranceName+" will cancel insurance for your "+petType);
    }
}
class Health extends Insurance{
Health(String insuranceName){
    super(insuranceName);

}
void getQuote(){
    System.out.println(insuranceName+" gave a quote for a health insurance");
}
void cancelInsurance(){
    System.out.println(insuranceName+" canceled your health insurance");
}
}
