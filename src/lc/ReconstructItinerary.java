package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ReconstructItinerary {

  Map<String, List<String>> flightDestList;
  List<List<String>> tickets;  
  Stack<String> itinerary;
  
  //. could this be more efficient?  yes, probably
  public List<String> findItinerary(List<List<String>> tickets)
  {   
    this.tickets = tickets;
    this.itinerary = new Stack<>();
    
    // always starting from "JFK"
    flightDestList = buildDestList(tickets);
    itinerary.push("JFK");
    findItineraries("JFK");
    
    List<String> itList = new ArrayList<>();
    while(!itinerary.empty())
      itList.add(0, itinerary.pop());
    return itList;
  }

  // build a destination list
  Map<String, List<String>> buildDestList(List<List<String>> tickets)
  {
    tickets.sort((t1, t2) -> {
      int cmp = t1.get(0).compareTo(t2.get(0));
      if (cmp != 0) return cmp;
      return t1.get(1).compareTo(t2.get(1));
    });
    
    Map<String, List<String>> adjList = new HashMap<>();
    for(List<String> edge: tickets) {
      if (!adjList.containsKey(edge.get(0))) adjList.put(edge.get(0), new ArrayList<>());
      
      adjList.get(edge.get(0)).add(edge.get(1));
    }
    return adjList;
  }
  
  /**
   * start from "next flight"
   * follow ticket train to the end, removing tickets as needed in subsequent calls
   * record ticket train into a cache
   */
  boolean findItineraries(String nextFlight)
  {
    // valid path
    if  (itinerary.size() == tickets.size() + 1) return true;
    
    // no valid path
    if (!flightDestList.containsKey(nextFlight)) return false;
    
    List<String> flList = new ArrayList<>();
    flList.addAll(flightDestList.get(nextFlight));
    for(int i = 0; i < flList.size(); i++) {
      String it = flList.get(i);
      flightDestList.get(nextFlight).remove(i);
      itinerary.push(it);
      
      if (findItineraries(it)) 
        return true;
      
      flightDestList.get(nextFlight).add(i, it);
      itinerary.pop();
    }
    return false;
  }

 
}
