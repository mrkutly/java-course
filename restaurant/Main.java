package restaurant;

public class Main {
  public static void main(String[] args) {
    Customer mark = new Customer("mark", "sauer-utley");
    Restaurant dostoros = new Restaurant("dos toros");
    Review rev = mark.addReview("amazing food!", dostoros.getId());
    System.out.println(rev.getCustomer());
    System.out.println(rev.getContent());
  }
}
