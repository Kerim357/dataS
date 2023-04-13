package task1;

public class Stack<Item> {
    private Queue<Item> q1;
    private Queue<Item> q2;

    public Stack() {
    	this.stackTop=null;
    }

    public void push(Item data) {
    	Node<Item> newNode=new Node<Item>();
		if(newNode==null) {
			System.out.println("Stack is full");
			}
		newNode.data=value;
		newNode.next=stackTop;
		stackTop=newNode;
    }

    public Item pop() {
        
    	if (stackTop == null) {
            System.out.println("Stack underflow");
        }
        Node<Item> temp=stackTop;

        stackTop = stackTop.next;
        return temp.data;
    }

    public Item peek() {
    	if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stackTop.item;
    }

    public int size() {
    	return size;
    }

    public boolean isEmpty() {
    	return stackTop==null;
    }
}
