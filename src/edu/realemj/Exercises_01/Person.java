package edu.realemj.Exercises_01;

public class Person {
    private int age;
    
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }   
    
    public static int calcMonths(int years) {
        // Calculate months
        int m = years*12;
        return m;
    }
}
