import com.airline.model.*;
import java.util.List;

public class FlightManagementSystem {
  
  public static void main(String[] args) {
    var airline = new Airline();
    System.out.printf("Welcome everyone to the %s", airline.getName());

    var malasya370 = new Flight(2);
    airline.addFlight(malasya370);

    var passenger1 = new Passenger("P-001", "John Doe", List.of(20.0, 15.0));
    var passenger2 = new Passenger("P-002", "Jane Doe", List.of(25.0));
    var passenger3 = new Passenger("P-003", "Bob Smith", List.of(30.0));
    var passenger4 = new Passenger("P-004", "Alice Johnson", List.of(10.0));

    malasya370.addANewPassenger(passenger1);
    malasya370.addANewPassenger(passenger2);
    malasya370.addANewPassenger(passenger3);
    malasya370.addANewPassenger(passenger4);

    malasya370.viewNumberOfOccupiedSeats();
    malasya370.viewPassengerRegistered();
  }
}