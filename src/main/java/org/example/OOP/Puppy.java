package org.example.OOP;
       //Creating an Object
public class Puppy {
    public Puppy(String name) {
        // This constructor has one parameter, <i>name</i>.
        System.out.println("Passed Name is :" + name );
    }

    public static void main(String []args) {
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( "tommy" );
    }

}