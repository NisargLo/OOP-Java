// Heron's Formula for Scaler Triangle

import java.util.Scanner;

public class Heron_Formula {
    public static void main(String[] args){
        Calculate_Area ca1 = new Calculate_Area();
        ca1.findS();
        System.out.println("\nPerimeter = "+(ca1.s*2));
        double Answer = ca1.findArea(ca1.s);
        System.out.println("\nArea = "+Answer+" Unit Sq.");
    }
}

class Calculate_Area{
    Scanner sc = new Scanner(System.in);
    float[] side = new float[3];
    float s;
    public Calculate_Area(){
        for(byte i=1;i<=3;i++){
            System.out.println("\nEnter Side "+i+" :");
            side[i-1] = sc.nextFloat();
        }
    }

    public float findS(){
        return (side[0]+side[1]+side[2])/2;
    }

    public double findArea(float s){
        return Math.pow(s*(s-side[0])*(s-side[1])*(s-side[2]),0.5);
    }
}