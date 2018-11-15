package priority;
/* COSC 1P03
 * ASSIGNMENT #3
 * Name: (Karanjot Pabla)
 * Student #: (6231377)
 */

class PQNode<E extends Prioritized> {

  E item; 
  PQNode <E> next;
  
  public PQNode(E item, PQNode <E> next){

  this.next=next;
  this.item=item;

}
}