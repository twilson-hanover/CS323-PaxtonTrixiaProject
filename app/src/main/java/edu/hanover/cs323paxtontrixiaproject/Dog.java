package edu.hanover.cs323paxtontrixiaproject;

public class Dog {

    private String name;
    private String description;
    private int imageResourceId;

    //dog is an array of Dog
    public static final Dog[] dog = {
            new Dog("Husky", "Loyal, Outgoing, Mischievous", R.drawable.husky),
            new Dog("Labrador", "Friendly, Active, Outgoing", R.drawable.lab),
            new Dog("Corgi", "Affectionate, Smart, Alert", R.drawable.corgi),
            new Dog("German Shepherd", "Confident, Courageous, Smart", R.drawable.germanshep),
            new Dog("Pitbull", "Confident, Smart, Good-Natured", R.drawable.pitbull),
            new Dog("Beagle", "Friendly, Curious, Merry", R.drawable.beagle)
    };

    //Each Drink has a name, description, and an image resource
    private Dog(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
