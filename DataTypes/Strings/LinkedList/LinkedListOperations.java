package DataTypes.Strings.LinkedList;
class Node1{
    int data;
    Node1 next;
    Node1(int data , Node1 next){
        this.data = data;
        this.next = next;
    }
}
public class LinkedListOperations {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};

        Node1 head = null;
        Node1 tail = null;
        for(int val : arr){
            Node1 newNode = new Node1(val ,null);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }


        Node1 temp = head;
        while(temp != null){
            if(temp.data == 30){
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
    }
}
