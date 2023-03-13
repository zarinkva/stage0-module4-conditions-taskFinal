package school.mjc.stage0.conditions.finalTask;

import java.util.concurrent.Callable;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if ((x>0 && y>0)){
            System.out.println("first");
        }
        else if ((x<0 && y>0)){
            System.out.println("second");
        }
        else if ((x<0 && y<0)) {
            System.out.println("third");

        } else if ((x>0 && y<0)) {
            System.out.println("fourth");

        }
        else if(x==0 && y==0){
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        CoordinatePane coordinatePane=new CoordinatePane();
        coordinatePane.printQuadrant(0,0);
        coordinatePane.printQuadrant(10,15);
        coordinatePane.printQuadrant(25,-15);
        coordinatePane.printQuadrant(-100,-39);
        coordinatePane.printQuadrant(-78,0);
    }
}
