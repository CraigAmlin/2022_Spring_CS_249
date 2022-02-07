package edu.amlinc.Project00;

import java.util.*;
public class Project00 {
    public static void main(String[] args){
        //^ = XOR
        String a;
        final int LOOP_CT = 5;
        for(int i = 0; i <= LOOP_CT; i++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
           }
           System.out.println();
        }

        System.out.println("Ehh, whatever man.");

        a = """
                  flying
                        then
             is                                to
                            I           take
          this                shall                  it
        If                       never                   .
        """;
        System.out.println(a);

        Random r = new Random(System.currentTimeMillis());
        int roll = r.nextInt(20) + 1;
        System.out.println("You rolled a " + roll + "!");
    }
}
