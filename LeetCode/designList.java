class Node{
    int val;
    Node next;
    Node(int num){val = num; next = null;}
}

class MyLinkedList {

    /** Initialize your data structure here. */
    public MyLinkedList() {
        Node head;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node newNode = head;
        for(int i=0; i<=index; i++){
            if(newNode == null)
                return -1;
            if(i==index)
                return newNode;
            newNode = newNode.next; 
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new node(val);
        if(head == null){
            head = node;
        }
        else
            newNode.next = head;
            head = newNode;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = head;
        while(newNode.next!=null){
            newNode = newNode.next;
        }
        Node newer = new Node(val);
        newNode.next = newer;
        nerwer.next = null;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node curr = head;

        for(int i=0; i<=index; i++){
            if(curr==null)
                break;
            if(i==index){
                Node newNode = new Node(val);
                newNode.next = curr.next;
                curr = newNode;
            }
            curr = curr.next;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node curr = head;
        for(int i=0; i<index; i++){
            if(curr == null)
                break;
            if(i == index)
            {
                curr = curr.next.next;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */