package edu.amlinc.Project01;

public class Project01 {
    public static void main(String [] args){
        int [] arr;
        int [] primes = {2,3,5,7,11,13,17,19}; 
        arr = new int[5];
        arr[0] = 7;
        arr[1] = primes.length;
        //for each loop (type instance: array)
        for(int p: primes){
            System.out.println(p);
        }
    }
}
