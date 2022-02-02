package edu.amlinc.Project00;

public class Project00 {
    public static void main(String[] args){
        final int LOOP_CT = 5;
        for(int i = 0; i <= LOOP_CT; i++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
           }
           System.out.println();
        }
        System.out.println("Ehh, whatever man.");
    }
}
