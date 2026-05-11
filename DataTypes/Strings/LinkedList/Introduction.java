package DataTypes.Strings.LinkedList;

class Node {
    int data;
    Node next;
    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
}
public class Introduction {
    public static void main(String[] args) {
//    Node a = new Node(10 , null);
//        Node b = new Node(20,null);
//        Node c = new Node(30 ,null);
//        a.next = b;
//        b.next = c;
//        Node head = a;
//
//        Node temp = head;

//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        int count =0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        System.out.println(count);
//        int max = Integer.MIN_VALUE;
//
//        while(temp != head){
//            if(temp.data > max){
//                max = temp.data;
//            }
//            temp = temp.data;
//        }
//        System.out.println(max);
        int arr[] = {10,20,30,40,50};
        Node head = null;
        Node tail = null;
        for(int val : arr){
            Node newNode = new Node(val , null);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node newNode = new Node(5 ,null);
        newNode.next = head;
        head = newNode;

        Node newNode1 = new Node(60 ,null);
        tail.next = newNode1;
        tail = newNode1;
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data +  " ");
            temp = temp.next;
        }
    }
}
