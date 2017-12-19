package codeclan.com.packagesexample.human;

import codeclan.com.packagesexample.animal.Dog;
import codeclan.com.packagesexample.animal.Human;

public class Trainer extends Human{
    public void teach(Dog dog) {
        super.talk();
        dog.setName("Pet");

    }
}
