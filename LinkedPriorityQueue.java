package priority;

import java.util.NoSuchElementException;

/*
 * Name: (Karanjot Pabla)
 */

public class LinkedPriorityQueue<E extends Prioritized<E>> implements PriorityQueue<E> {
 PQNode <E> header, rare;

 public LinkedPriorityQueue  () {
 header=null; //sets header node to null ref.
 rare = new PQNode <E> (null, header); //allows first node in queue to be non-existent
 }
//The following method adds an item to a queue using generics (E)
//and PQNodes (queue Nodes with priority)
 public void add(E item) {
   PQNode <E> prev;
   PQNode <E> cur;
   prev = rare;    
   cur = header;
   
   if(cur==null){
     cur = new PQNode <E> (item,cur);
     prev.next= cur;
     }else{
       while(cur!=null){
           prev=cur;
           if(cur.item.compareTo(item)<0){
           prev.next=new PQNode <E>(item,cur);
           break;
         }
         prev=cur;
         cur=cur.next;
       }   
       }
     }
 

//The following method removes a item from the top of the queue
 public E removeFirst() {
   if(header==null){
    throw new NoSuchElementException();
   }
   E item =  header.item;
   rare.next=header;
   header=header.next;
   return item;
 }

 //This method looks at the top of the queue
 public E peekFirst() {
   if(header==null){
     System.out.println("Sorry, there is nothing I can display.");
     throw new NoSuchElementException();
   }
    return header.item;
 }
 
//This method updates the priority of Node in the priority queue
 public void updatePriority(String key, double newPriority) {
   PQNode <E> prev;
   PQNode <E> cur;
   prev = rare;    
   cur = header;
   
   if(cur==null){
   throw new NoSuchElementException();
   }
   while(cur!=null){
     if(cur.item.getKey()==key){
       prev.next=cur.next;
       add(cur.item);
     }else{
      prev=cur;
      cur=cur.next;
   }
   }
 }
 
//indicates if queue is empty of not
 public boolean empty() {
   if(header==null){
     return true;
   }
   else{
   return false;
   }
 }
 
}
