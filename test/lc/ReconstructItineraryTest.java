package lc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReconstructItineraryTest {
  ReconstructItinerary ri;
  
  @BeforeEach
  void setUp() throws Exception {
    ri = new ReconstructItinerary();
  }

  @Test
  void testFindItinerary1() {
    List<List<String>> tickets = Arrays.asList(
      Arrays.asList("MUC", "LHR"),
      Arrays.asList("JFK", "MUC"),
      Arrays.asList("SFO", "SJC"),
      Arrays.asList("LHR", "SFO")
    );
    
    List<String> itinerary = ri.findItinerary(tickets);
    List<String> expected = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");
    assertLinesMatch(expected, itinerary);
  }

  @Test
  void testFindItinerary2() {
    List<List<String>> tickets = Arrays.asList(
      Arrays.asList("JFK", "SFO"),
      Arrays.asList("JFK", "ATL"),
      Arrays.asList("SFO", "ATL"),
      Arrays.asList("ATL", "JFK"),
      Arrays.asList("ATL", "SFO")
    );
    
    List<String> itinerary = ri.findItinerary(tickets);
    List<String> expected = Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
    assertLinesMatch(expected, itinerary);
  }
  
  @Test
  void testFindItinerary3() {
    List<List<String>> tickets = Arrays.asList(
      Arrays.asList("JFK", "KUL"),
      Arrays.asList("JFK", "NRT"),
      Arrays.asList("NRT", "JFK")
    );
    
    List<String> itinerary = ri.findItinerary(tickets);
    List<String> expected = Arrays.asList("JFK", "NRT", "JFK", "KUL");
    assertLinesMatch(expected, itinerary);
  }
}
