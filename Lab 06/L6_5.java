/*
    Create a class named ThreeDPoint to model a point in a three-dimensional space.
    Let ThreeDPoint be derived from MyPoint with following additional features:
    a. A data fields named z that represents the z-coordinate.
    b. A no-arg constructor that creates a point (0, 0, 0).
    c. A constructor that constructs a point with three specified coordinates.
    d. A get method that returns the z value.
    e. Override the distance method to return the distance between two points in the three-dimensional space.
    f. Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the distance between the two points.
 */

public class L6_5 {
    public static void main(String[] args) {
        ThreeDPoint[] tdp=new ThreeDPoint[3];
        tdp[0]=new ThreeDPoint();
        tdp[1]=new ThreeDPoint(1,2,3);
        tdp[2]=new ThreeDPoint(6,7,8);
        double ans1=tdp[1].distance(tdp[0]);
        double ans2=tdp[2].distance(10,11,12);
        System.out.println("\nDistance between points ("+tdp[1].X+","+tdp[1].Y+","+tdp[1].getZ()+") & ("+tdp[0].X+","+tdp[0].Y+","+tdp[0].getZ()+") = "+ans1+" Units");
        System.out.println("\nDistance between points ("+tdp[2].X+","+tdp[2].Y+","+tdp[2].getZ()+") & ("+tdp[2].S1+","+tdp[2].S2+","+tdp[2].S3+") = "+ans2+" Units\n");
    }
}

class ThreeDPoint extends MyPoint{
    int Z, S3;

    ThreeDPoint(){
        X=0;
        Y=0;
        Z=0;
    }

    ThreeDPoint(int X, int Y, int Z){
        this.X=X;
        this.Y=Y;
        this.Z=Z;
    }

    public int getZ(){
        return Z;
    }

    public double distance(ThreeDPoint obj){
        return Math.pow( Math.pow(obj.X-this.X,2) + Math.pow(obj.Y-this.Y,2) + Math.pow(obj.Z-this.Z,2) ,0.5);
    }

    public double distance(int X, int Y, int Z){
        S1=X;
        S2=Y;
        S3=Z;
        return Math.pow( Math.pow(X-this.X,2) + Math.pow(Y-this.Y,2) + Math.pow(Z-this.Z,2),0.5);
    }
}