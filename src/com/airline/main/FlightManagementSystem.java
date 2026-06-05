import com.airline.model.*;

public class FlightManagementSystem {
  
  public static void main(String[] args) {
    var airline = new Airline();
    System.out.printf("Name: %s", airline.getName());
  }
}