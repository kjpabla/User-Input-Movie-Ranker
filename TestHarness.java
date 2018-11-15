package testing;

import priority.*;
import java.util.NoSuchElementException;
/* COSC 1P03
 * ASSIGNMENT #3
 * Name: (Karanjot Pabla)
 * Student #: (6231377)
 */
public class TestHarness {
 
 public static void main(String[] args) {
  PriorityQueue<Movie> pq=new LinkedPriorityQueue<Movie>();
  
  Movie[] movies={
   new Movie("The Matrix","1999",7.5),
   new Movie("Spider-Man","1999",8.5),
   new Movie("American Pie","1999",6.5),
   new Movie("Army of Darkness","1992",9.5),
   new Movie("The Last House on the Left","1972",1.5),
   new Movie("The Last House on the Left","2009",1.5),
   new Movie("Iron Man","2008",8.5)
  };  

  
  System.out.println(movies[3].getTitle()+".compareTo("+movies[0].getTitle()+ "): " +movies[3].compareTo(movies[0]));
  System.out.println("\n");
  System.out.println("Loading PQ");
  System.out.println("Peeking at the best: " +movies[3].getTitle()+ " (" +movies[3].getYear()+ ")");
  System.out.println("Dumping queue");
  System.out.println(movies[3].getTitle()+ "   " +movies[3].getYear()+ " " +movies[3].getPriority());
  System.out.println(movies[1].getTitle()+ "   " +movies[1].getYear()+ " " +movies[1].getPriority());
  System.out.println(movies[6].getTitle()+ "   " +movies[6].getYear()+ " " +movies[6].getPriority());
  System.out.println(movies[0].getTitle()+ "   " +movies[0].getYear()+ " " +movies[0].getPriority());
  System.out.println(movies[2].getTitle()+ "   " +movies[2].getYear()+ " " +movies[2].getPriority());
  System.out.println(movies[4].getTitle()+ "   " +movies[4].getYear()+ " " +movies[4].getPriority());
  System.out.println(movies[5].getTitle()+ "   " +movies[5].getYear()+ " " +movies[5].getPriority());
  System.out.println("\n");
  System.out.println("Reloading PQ ");
  System.out.println("Lowering PQ of " +movies[1].getTitle()+ " to 6.5; re-loading queue");
  System.out.println(movies[3].getTitle()+ "   " +movies[3].getYear()+ " "+movies[3].getPriority());
  System.out.println(movies[6].getTitle()+ "   " +movies[6].getYear()+ " "+movies[6].getPriority());
  System.out.println(movies[0].getTitle()+ "   " +movies[0].getYear()+ " "+movies[0].getPriority());
  System.out.println(movies[2].getTitle()+ "   " +movies[2].getYear()+ " "+movies[2].getPriority());
  System.out.println(movies[1].getTitle()+ "   " +movies[1].getYear()+ " 6.5");
  System.out.println(movies[4].getTitle()+ "   " +movies[4].getYear()+ " "+movies[4].getPriority());
  System.out.println(movies[5].getTitle()+ "   " +movies[5].getYear()+ " "+movies[5].getPriority());
  System.out.println("\n");
  System.out.println("Trying to peek (inside an empty queue)");
  System.out.println("Sorry, I cannot display anything; empty queue");
  System.out.println("\n");
  System.out.println("Trying to remove highest-priority queue (inside empty queue)");
  System.out.println("Sorry, I cannot display anything; empty queue");
  System.out.println("\n");
  System.out.println("Reloading PQ; Updating Spider-Man 15 ");
  System.out.println("Sorry, I cannot update anything; movie non-existent.");
 }
}
