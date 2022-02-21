package edu.amlinc.Project01;

public class Project01 {
    public static void main(String [] args){
        int [][] arr = new int[15][10];
        int [] primes = {2,3,5,7,11,13,17,19};
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = 0;
            }
        }
        //for each loop (type instance: array)
        for(int p: primes){
            System.out.println(p);
        }
    }
}
