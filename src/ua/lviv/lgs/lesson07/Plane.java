package ua.lviv.lgs.lesson07;
import java.util.Random;

public abstract class Plane extends AircraftControl implements Opportunitiesable {
    private int a = 20;
    private int b = 80;
    private int RandomNumber = a + (int) (Math.random() * b);
    public void StartingEngines(){
        System.out.println("To readiness to fly left: "+RandomNumber);
    }
    public void TakeoffOfThePlane(){
        System.out.println("The plane will pass kilometers on a full tank of fuel: "+ Math.random()*1000);
    }
    public void LandingOfThePlane(){
        System.out.println("The plane is landing");
    }
    private double length;
    private double width;
    private double weight;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
