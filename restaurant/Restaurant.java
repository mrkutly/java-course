package restaurant;
import java.util.ArrayList;

public class Restaurant {
  private static int count = 0;
  private static ArrayList<Restaurant> all = new ArrayList<Restaurant>();
  private int id;
  private String name;

  public Restaurant(String name) {
    this.id = Restaurant.count++;
    this.name = name;
  }

  public static Restaurant find(int id) {
    Restaurant found = null;

    for(Restaurant restaurant : Restaurant.all) {
      if (restaurant.id == id){
        found = restaurant;
        break;
      }
    }
    return found;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }
}
