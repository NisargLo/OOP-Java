// Attendance of Sem-2, Batch-A, Year : (2023-2024)
// crud program

import java.util.Objects;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter 1 for 'Present', 0 for 'Absent' & 2 for skipping whole Class (A, B or C).");
        Class_Attendance ca=new Class_Attendance();
        ca.printAttendance();
        System.out.println("\n\nDo you want to modify ?\nEnter 1 for 'Yes' & 0 for 'No'.)");
        byte a=sc.nextByte();
        if(a==1){
            ca.modifyAttendance();
        }
    }
}

class Class_Attendance{
    String[] b=new String[267];
    short l=(short)(b.length),i;
    byte c=0;
    Class_Attendance(){
        Scanner sc=new Scanner(System.in);
        for(i=0;i<l;i++){
            b[i] = null;
        }
        for(i=0;i<l;i++){
            if((i>=0 && i<=67 && i!=1) || (i>=100 && i<=167) || (i>=200)){
                do{
                    System.out.println("\nRoll NO. - "+(i+101));
                    b[i]=sc.next();
                }while (!Objects.equals(b[i],"0") && !Objects.equals(b[i],"1") && !Objects.equals(b[i],"2"));
            }
            if(Objects.equals(b[i],"2") && i<=67){
                i=99;
            }
            else if(Objects.equals(b[i],"2") && i<=167){
                i=199;
            }
            else if(Objects.equals(b[i],"2")){
                break;
            }
        }
    }

    protected void printAttendance(){
        for(i=0;i<l;i++) {
            if (Objects.equals(b[i],"0")) {
                c = 7;
                break;
            }
        }
        if(c==7) {
            System.out.println("\nAbsent Student's Roll NO. :");
            for (i=0; i<l; i++) {
                if (Objects.equals(b[i],"0")) {
                    System.out.print((i+101) + ", ");
                }
            }
        }
        else if(c==0){
            System.out.print("\nNo Student is Absent.");
        }
    }

    protected void modifyAttendance(){
        c=0;
        Scanner sc=new Scanner(System.in);
        while(i!=10){
            System.out.println("\nEnter Roll NO. :\n(Enter 2 for ending modification)");
            i=sc.nextShort();
            if(i==2){
                break;
            }
            System.out.println("Enter 1 for Present & 0 for Absent :");
            do{
                b[(i-101)]=sc.next();
            }while (!Objects.equals(b[(i-101)],"0") && !Objects.equals(b[(i-101)],"1") && !Objects.equals(b[(i-101)],"2"));
        }
        for(i=0;i<l;i++) {
            if (Objects.equals(b[i],"0")) {
                c = 7;
                break;
            }
        }
        if(c==7) {
            System.out.println("\nAbsent Student's Roll NO. (Modified) :");
            for (i=0; i<l; i++) {
                if (Objects.equals(b[i],"0")) {
                    System.out.print((i+101) + ", ");
                }
            }
        }
        else if(c==0){
            System.out.print("\nNo Student is Absent (Modified).");
        }
        System.out.println();
        sc.close();
    }
}

// By - Nisarg Lo