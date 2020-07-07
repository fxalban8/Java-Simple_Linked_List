package eda.simple.lists;

public class SinglyLinkedList {
	
private static class ListNode {
private int data;
private ListNode next;

 public ListNode (int data){
      this.data = data;
       this.next = null; //when creating a new node, this one does not reference any node
}

}
public void display(ListNode head){
if (head == null){
return;
}

ListNode current = head;
while (current ==null){
System.out.println(current.data + "---> ");
current= current.next;
}
      System.out.print(current);
}
public int length(ListNode head) {
if (head == null){
return 0;
}
int count = 0;
ListNode current = head;
while (current != null){
count ++;
current= current.next;
}
return count;
}



// Insertar al inicio
public ListNode insertAtBeginning(ListNode head, int data) {
ListNode newNode = new ListNode (data);
if (head ==null){
  return newNode;
}  
newNode.next = head;
 head = newNode;
return head;

}
public ListNode insertAtEnd(ListNode head, int data){
ListNode newNode = new ListNode(data);
if (head ==null){
return newNode;
}
ListNode current = head;
while (null != current.next) {
current =current.next;
} 
current.next = newNode;
return head;
}


public static void main (String [] arg) {

ListNode head = new ListNode (10);
ListNode second = new ListNode (8);
ListNode third = new ListNode (1);
ListNode fourth = new ListNode (11);

//creating the list
head.next = second;
second.next = third;
third.next = fourth;


SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//singlyLinkedList.display(head);
//System.out.println();
//ListNode newHead = singlyLinkedList.insertAtEnd(head, 15);
//ListNode newHead = singlyLinkedList.insertAtBeginning(head, 15);
singlyLinkedList.display(head);
System.out.println();
ListNode newHead = singlyLinkedList.insertAtBeginning(head, 15);
singlyLinkedList.display(newHead);
}
}