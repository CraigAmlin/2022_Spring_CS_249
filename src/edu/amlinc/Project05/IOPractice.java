package edu.amlinc.Project05;

import java.util.*;
import java.io.*;

public class IOPractice {
    public static void main(String[] args){
        try(
            Scanner userIn = new Scanner(System.in);
            Scanner fileIn = new Scanner(new File("./SECRETS.txt"));
        )
        {

        }
        catch(Exception e){
            System.err.println("ERROR: " + e);
        }
    }
}
