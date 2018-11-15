package priority;
/* 
 * Name: (Karanjot Pabla)
 */

public interface PriorityQueue<E extends Prioritized<E>> {
 public void add(E item);
 public E removeFirst(); 
 public E peekFirst(); 
 public void updatePriority(String key, double newPriority); 
 public boolean empty();

}


