package ua.lviv.lgs.lesson07;

public class Su27 extends Plane {
    int MaxSpeed;
    String color;
    private int RandomNumber = (MaxSpeed+100) + (int) (Math.random() * (MaxSpeed+1000));
    @Override
    public String toString() {
        return "Su27{" +
                "MaxSpeed=" + MaxSpeed +
                ", color='" + color + '\'' +
                '}';
    }

    Su27(int MaxSpeed, String color){
        this.color = color;
        this.MaxSpeed = MaxSpeed;
    }
    @Override
    public void TurboAcceleration() {
        System.out.println("Speed: "+RandomNumber+" km/hour");
    }

    @Override
    public void StealthTechnology() {
        System.out.println("The plane is not visible for: "+ Math.random());
    }

    @Override
    public void NuclearStrike() {
        System.out.println("Number of nuclear warheads: "+Math.random()*10);
    }
}
