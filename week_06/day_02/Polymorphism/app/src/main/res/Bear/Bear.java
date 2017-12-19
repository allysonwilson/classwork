package Bear;

/**
 * Created by allysonwilson on 9/6/17.
 */

public class Bear {
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public Bear() {
        energy = 0;

    }
    public void eat(Salmon salmon) {
        energy += salmon.getCalories();
    }

}
