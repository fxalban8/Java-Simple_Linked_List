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


public void addAfter(ListNode current, int value) {
	ListNode nodo = new ListNode (value);
	nodo.next=current.next;
	current.next=nodo;
}


public void removeLast(ListNode head) {
	if(head==null) {
		return;
	}
	ListNode current = head;
	while(current.next.next!=null) {
		current=current.next;
	}
	current.next=null;
}


public void display(ListNode head){
if (head == null){
return;
}

ListNode current = head;
while (current !=null){
System.out.print(current.data + "---> ");
current= current.next;
}
      System.out.print(current);
}

public void getNodo(ListNode head, int index) {
	ListNode current = head;
	if(current==null) {
		System.out.println("");
	}
	for(int i=0; i<index;i++) {
		current=current.next;
	}
	System.out.println(current.data);
	
}

public void deleteNode(ListNode head, int index) {
	ListNode anterior_borrar= head;
	
	if(anterior_borrar==null) {
		System.out.println("No objetcts to delete");
	}
	for(int i=0; i+1<index;i++) {
		anterior_borrar=anterior_borrar.next;
	}
	ListNode borrar= anterior_borrar.next;
	anterior_borrar.next= borrar.next;
	borrar.next=null;
	
	
	
	
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
System.out.println();

//removing the last element
singlyLinkedList.removeLast(head);
singlyLinkedList.display(newHead);

//adding after a node
System.out.println();
singlyLinkedList.addAfter(second, 45);
singlyLinkedList.display(newHead);

//get node by index
System.out.println();
singlyLinkedList.getNodo(newHead, 0);

//deleting a node
System.out.println();
singlyLinkedList.deleteNode(newHead, 4);
singlyLinkedList.display(newHead);

System.out.println();
singlyLinkedList.deleteNode(newHead, 1);
singlyLinkedList.display(newHead);


}



}