package priority;
/* COSC 1P03
 * ASSIGNMENT #3
 * Name: (Karanjot Pabla)
 * Student #: (6231377)
 */

public interface PriorityQueue<E extends Prioritized<E>> {
 public void add(E item);
 public E removeFirst(); 
 public E peekFirst(); 
 public void updatePriority(String key, double newPriority); 
 public boolean empty();

}


