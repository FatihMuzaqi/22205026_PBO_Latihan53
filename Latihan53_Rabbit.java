package oop;

class Animal {
protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegatarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

}
class Rabbit extends Animal {

    private String color;
    private String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String geName() {
        return name;
    }

}

public class Latihan53_Rabbit {

    public static void main(String[] args) {
        Rabbit kelinci = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + kelinci.geName());
        System.out.println(kelinci.geName() + " is Vegetarian? " + kelinci.vegetarian);
        System.out.println(kelinci.geName() + " eats " + kelinci.getEats());
        System.out.println(kelinci.geName() + " has " + kelinci.getNoOfLegs() + " legs.");
        System.out.println(kelinci.geName() + " color is " + kelinci.getColor());
    }

}