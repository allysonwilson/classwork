package example.codeclan.com.sql_start_point;

/**
 * Created by user on 30/08/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Artist artist1 = new Artist("Yeah Yeah Yeahs");
        artist1.save();
        Album album1 = new Album("Maps", "Rock", artist1);
        album1.save();
    }
}
