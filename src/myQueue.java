import java.util.Queue;

public class myQueue extends myLinkedList {
    public myQueue( ) {
        super();
    }

    public void enqueue( int v ) {
        Node n = new Node(v);
        //int x goes to top of stack -- insert front
        myQueue.super.insertRear(n);
    }

    public int dequeue( ){
        int copy = myQueue.super.getItem(1);
        myQueue.super.deleteFront();
        return copy;
    }

    public boolean isEmpty( ) {
        if(myQueue.super.getSize() == 0)
            return true;
        else
            return false;
    }

    public int front( ){
        return myQueue.super.getItem(1);
    }

    public int rear( ){

        return myQueue.super.getItem(getSize());
    }
}
