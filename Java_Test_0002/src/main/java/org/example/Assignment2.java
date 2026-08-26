package org.example;

public class Assignment2 {
    public static final int TOTAL_ROWS=5;
    public static void main(String[] args) {

        for(int i=1;i<=TOTAL_ROWS;i++){
            //Printing Leading spaces
            for(int j=i;j<TOTAL_ROWS;j++){
                System.out.print("  ");
            }
            //Print incresing numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //Print decreasing numbers
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
