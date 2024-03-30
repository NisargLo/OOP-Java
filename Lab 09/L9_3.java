/*
    Write a complete multi-threaded program to meet following requirements:
        a. Read matrix [A] m x n
        b. Create m number of threads
        c. Each thread computes summation (sum) of elements of one row, i.e. ith row of the matrix is processed by ith thread (where 0 <= i < m).
        d. Print the results.

    (Execute Thread by extending Thread Class)
 */

import java.util.*;

public class L9_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte i;
        System.out.println("\nEnter No. of rows :");
        int m=sc.nextInt();
        System.out.println("\nEnter No. of columns :");
        int n=sc.nextInt();
        int[][] A = new int[m][n];
        for(i=0;i<m;i++){
            System.out.println();
            for(byte j=0;j<n;j++){
                System.out.println("Enter A["+(i+1)+"]["+(j+1)+"] :");
                A[i][j]=sc.nextInt();
            }
        }
        sc.close();
        Matrix[] thread=new Matrix[m];
        for(i=0;i<m;i++){
            thread[i]=new Matrix(A[i],i);
            thread[i].start();
        }

    }
}

class Matrix extends Thread{
    private byte i;
    private int[] row;
    private int rowIndex, s;
    Matrix(int[] row, int rowIndex){
        this.row=row;
        this.rowIndex=rowIndex;
    }

    @Override
    public void run(){
        s=0;
        for(int value: row){
            s += value;
        }
        System.out.println("\nSum of elements in row " + rowIndex + " : " + s);
    }

    protected int getSum(){
        return s;
    }
}