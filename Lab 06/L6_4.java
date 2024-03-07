/*
    Design a class named MyPoint to represent a point with x and y-coordinates.
    The class contains :-
    a. The data fields x and y that represent the coordinates with getter methods.
    b. A no-arg constructor that creates a point (0, 0).
    c. A constructor that constructs a point with specified coordinates.
    d. A method named distance that returns the distance from this point to a specified point of the MyPoint type.
    e. A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 */

public class L6_4 {
    public static void main(String[] args) {
        MyPoint mp0=new MyPoint();
        MyPoint mp1=new MyPoint(1,2);
        MyPoint mp2=new MyPoint(3,4);
        double ans1=mp1.distance(mp0);
        double ans2=mp2.distance(7,8);
        System.out.println("\nDistance between points ("+mp1.X+","+mp1.Y+") & ("+mp0.X+","+mp0.Y+") = "+ans1+" Units");
        System.out.println("\nDistance between points ("+mp2.X+","+mp2.Y+") & ("+mp2.S1+","+mp2.S2+") = "+ans2+" Units");
    }
}

class MyPoint{
    int X, Y, S1, S2;

    MyPoint(){
        X=0;
        Y=0;
    }

    MyPoint(int X, int Y){
        this.X=X;
        this.Y=Y;
    }

    public double distance(MyPoint obj){
        return Math.pow( Math.pow(obj.X-this.X,2) + Math.pow(obj.Y-this.Y,2) ,0.5);
    }

    public double distance(int X, int Y){
        S1=X;
        S2=Y;
        return Math.pow( Math.pow(X-this.X,2) + Math.pow(Y-this.Y,2) ,0.5);
    }
}