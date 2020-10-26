package ua.lviv.lgs.lesson07;

import java.util.Random;

public class AircraftControl {
    Random r = new Random();
    void MoveUp() {
        System.out.println("Moving Up on: "+r.nextInt(100)+" kilimeters");
    }
    void MoveDown() {
        System.out.println("Moving Down on: "+r.nextInt(100)+" kilimeters");
    }
    void MoveLeft() {
        System.out.println("Moving Left on: "+r.nextInt(100)+" kilimeters");
    }
    void MoveRight() {
        System.out.println("Moving Right on: "+r.nextInt(100)+" kilimeters");
    }

}
