package example.codeclan.com.try_catch_start;

/**
 * Created by user on 30/08/2017.
 */

public class ExampleTryCatch{
    PetShop shop;

    public void run(){
        setup();

        try{
        Pet found = shop.findPetByName(null);
        System.out.println("Found pet: " + found.getName());
            return;

    } catch (ArgumentNullException e){
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("I'm done.");
        }
    }
//finally will run code no matter what despite exceptions such as closing database-to prevent server crashing
    public void setup(){
        shop = new PetShop();
        shop.addPet(new Dog("Rover"));
        shop.addPet(new Cat("MEOWingtons"));
        shop.addPet(new Fish("FINlay"));
    }
}

