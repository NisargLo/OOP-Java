// Distance between 2 points on Graph

import java.util.Scanner;

public class Distance_2Points {
    public static void main(String[] args){
    Distance d = new Distance();
    double Answer = d.find_Distance();
    System.out.println("\nDistance between 2 points on Graph = "+Answer+" Units");
    }
}

class Distance{
    Scanner sc = new Scanner(System.in);
    int[] point = new int[4];
    Distance(){
        for(byte i=0;i<4;i++){
            if(i==0){
                System.out.println("\nPoint 1 :-");
            }
            else if (i==2) {
                System.out.println("\nPoint 2 :-");
            }
            if(i%2==0){
                System.out.println("Enter X Coordinate :");
                point[i] = sc.nextInt();
            }
            else if (i%2==1) {
                System.out.println("Enter Y Coordinate :");
                point[i] = sc.nextInt();
            }
        }
    }

    protected double find_Distance(){
        return Math.pow( Math.pow(point[2]-point[0],2) + Math.pow(point[3]-point[1],2) ,0.5);
    }
}