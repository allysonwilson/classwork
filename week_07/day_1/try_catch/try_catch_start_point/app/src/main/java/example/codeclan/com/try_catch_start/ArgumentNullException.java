package example.codeclan.com.try_catch_start;

/**
 * Created by allysonwilson on 9/11/17.
 */

public class ArgumentNullException extends Exception {
    public ArgumentNullException(String argumentName){
        super("Argument" + argumentName + "is null");
    }
}
