package priority;


public interface Prioritized<E extends Prioritized<E>> extends Comparable<E> {
 public String getKey();
 
 public double getPriority();
 public double changePriority(double newPriority);
}
