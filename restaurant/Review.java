package restaurant;
import java.util.ArrayList;

public class Review {
  private static int count;
  private static ArrayList<Review> all = new ArrayList<Review>();
  private int id;
  private String content;
  private int restaurantId;
  private int customerId;

  public Review(String content, int restaurantId, int customerId){
    this.id = Review.count++;
    this.content = content;
    this.restaurantId = restaurantId;
    this.customerId = customerId;
    all.add(this);
  }

  public static ArrayList getAll() {
    return Review.all;
  }

  public String getContent() {
    return this.content;
  }

  public Customer getCustomer() {
    return Customer.find(this.customerId);
  }

  public int getId() {
    return this.id;
  }

  public Restaurant getRestaurant() {
    return Restaurant.find(this.restaurantId);
  }
}
