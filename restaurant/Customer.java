package restaurant;
import java.util.ArrayList;

public class Customer {
  private static int count = 0;
  private static ArrayList<Customer> all = new ArrayList<Customer>();
  private String firstName;
  private String lastName;
  private ArrayList<Integer> reviews;
  private int id;

  public Customer(String firstName, String lastName) {
    this.reviews = new ArrayList<Integer>();
    this.id = Customer.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    all.add(this);
  }

  public static ArrayList getAll() {
    return Customer.all;
  }

  public static ArrayList allNames() {
    ArrayList<String> names = new ArrayList<String>();
    for(Customer customer :Customer.all)
      names.add(customer.getName());

    return names;
  }

  public static Customer find(int id) {
    Customer found = null;

    for(Customer customer :Customer.all) {
      if (customer.id == id){
        found = customer;
        break;
      }
    }
    return found;
  }

  public static Customer findByName(String name) {
    Customer found = null;

    for(Customer customer :Customer.all) {
      if (customer.getName().equals(name)){
        found = customer;
        break;
      }
    }

    return found;
  }

  public static ArrayList findAllByFirstName(String name) {
    ArrayList<Customer> customers = new ArrayList<Customer>();

    for(Customer customer :Customer.all) {
      if(customer.firstName.equals(name))
        customers.add(customer);
    }
    return customers;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public int getId() {
    return this.id;
  }

  public Review addReview(String content, int restaurantId) {
    Review rev = new Review(content, restaurantId, this.id);
    this.reviews.add(rev.getId());
    return rev;
  }
}
