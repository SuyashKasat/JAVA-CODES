import java.util.*;
public class Linkedlist{

static class Node{
int data;
Node next;
Node(int d){
      data =d;
      next=null;
}
}
Node head=null;
int count=0;

public void createList(){
int choice=0;
Node temp=null;
do{
count ++;
Scanner s=new Scanner(System.in);
System.out.print("Enter node data:");
int x=s.nextInt();
Node newnode= new Node(x);
if(head==null){
head=temp=newnode;
}
else{
temp.next=newnode;
temp=newnode;
}
System.out.print("enter 1 to continue & enter 0 to exit: ");
choice=s.nextInt();
}while(choice==1);
}


public void printList(){
Node n=head;
System.out.print("linked list is:");
while(n!=null){
System.out.print(n.data+" ");
n=n.next;
}
System.out.println(" ");
}

public void deleteList(int x){
Node temp=head;
Node prev=null;
if(x>count){
System.out.println("Node not present");
}
else if(x==1){
prev=temp;
head=prev.next;
count--;
}
else if(x==count){
while(temp.next!=null){
prev=temp;
temp=temp.next;
}
prev.next=null;
count--;
}
else{
for(int  i=1; i<x;i++){
prev=temp;
temp=temp.next;
}
prev.next=temp.next;
count--;
}
}
public void Modify(int x){
Scanner s=new Scanner(System.in);
System.out.println("enter node data");
int y=s.nextInt();
Node temp=head;
if(x>count){
System.out.println("Node not present");
}
else if(x==1){
head.data=y;
}
else if(x==count){
while(temp.next!=null){
temp=temp.next;
}
temp.data=y;

}
else{
for(int  i=1; i<x;i++){
temp=temp.next;
}
temp.data=y;;
}
}

public void insertListbeg(){
Node temp=head;


Scanner s=new Scanner(System.in);
System.out.print("Enter node data:");
int y=s.nextInt();
Node newnode= new Node(y);
newnode.next=head;
head=newnode;
count++;
}

public void insertListlast(){
Node temp=head;
while(temp.next!=null){
temp=temp.next;
}
Scanner s=new Scanner(System.in);
System.out.print("Enter node data:");
int y=s.nextInt();
Node newnode= new Node(y);
temp.next=newnode;
count++;
}

public void Insertpos(int x){
Node temp=head;
Node prev=null;
Scanner s=new Scanner(System.in);
System.out.print("Enter node data:");
int y=s.nextInt();
Node newnode= new Node(y);
for(int  i=0; i<x;i++){
prev=temp;
temp=temp.next;
}
prev.next=newnode;
newnode.next=temp;
count++;
}


public static void main(String[] args){
Linkedlist llist=new Linkedlist();
llist.createList();
int choice=0;
do{
System.out.println(" Enter 1 to printlist, Enter 2 to Deletefromlist, Enter 3 to count, Enter 4 to modify"+ "\n" + " Enter 5 to insert at beginning, Enter 6 to insert at last, Enter 7 to insert after position"); 
Scanner s=new Scanner(System.in);
System.out.print("enter no:");
int n=s.nextInt();
switch (n){

case 1:
llist.printList();
break;

case 2:
System.out.println(" ");
System.out.print("enter node no:");
int y=s.nextInt();
llist.deleteList(y);
break;

case 3:
System.out.println("no.of nodes are:" + llist.count);
break;

case 4:
System.out.print("enter node no in which data is to be replaced :");
int z=s.nextInt();
llist.Modify(z);
break;

case 5:
llist.insertListbeg();
break;

case 6:
llist.insertListlast();
break;

case 7:
System.out.print("enter after which node you want to insert rather than last node :");
int p=s.nextInt();
llist.Insertpos(p);
}
System.out.print("Press 1  if want to continue:");
choice=s.nextInt();
}while(choice==1);

}
}


// Time complexity for creating list is O(n)
// Time Complexity for deletion is O(n)
// Time complexity for insertion is O(n)
// Time complexity for modify is O(n)
  
