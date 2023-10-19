package org.example.OOP;

public class Puppy2 {
    int puppyAge;

    public Puppy2(String name) {
        System.out.println("Name chosen is:"  + name);
    }

    public int getPuppyAge() {
        System.out.println("Puppy's age is:" + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public static void main(String[] args) {

//        Object creation
        Puppy2 myPuppy = new Puppy2("Tommy");

//        Call class method to set puppy's age
        myPuppy.setPuppyAge(5);

//        Call another class method to get puppy's age
        myPuppy.getPuppyAge();

//        You can access instance variables as follows as well
        System.out.println("Variable Value:" + myPuppy.puppyAge);
    }
}

