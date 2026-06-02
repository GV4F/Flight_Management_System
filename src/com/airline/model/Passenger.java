import java.util.List;

public class Passenger {
  private String id; 
  private String name;
  private List<Double> luggageWeights;

  public Passenger(String id, String name, List<Double> luggageWeights) {
    this.id = id;
    this.name = name;
    this.luggageWeights = luggageWeights;
  }
  
  public void validateLuggage() {
    if (this.luggageWeights.size() > 1) {
      System.out.println("Baggage allowance exceeded");
    }
    if (this.luggageWeights.get(0) > 8) {
      System.out.println("Luggage exceeds the permitted weight");
      System.out.println("A $.40.00 fine will be applied for excess weight");
    }
  }

  public String getID() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public List<Double> getLuggageWeights() {
    return luggageWeights;
  }
  
}