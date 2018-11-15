package priority;
/* 
 * Name: (Karanjot Pabla)
 * 
 */

class PQNode<E extends Prioritized> {

  E item; 
  PQNode <E> next;
  
  public PQNode(E item, PQNode <E> next){

  this.next=next;
  this.item=item;

}
}
