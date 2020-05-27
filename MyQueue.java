
/**
 * class MyQueue implemented using ArrayList. The index 0 element is the front of the queue
 * The last element of the queue has index tail
 
 * @version 03/20/2020
 */
/**

 */

import java.util.ArrayList;

public class MyQueue<E>
{
    private ArrayList<E> list; // hold the elements in queue
    private int tail; // index of the last element in queue

    /**
     * constructor construct an empty queue
     */
    public MyQueue()
    {
        list = new ArrayList<E>();
        tail = -1;
    }

    /**
     * isEmpty return true if the queue is empty; false otherwise
     * @return true if the queue is empty; false otherwise
     */
    public boolean isEmpty()
    {
       return list.isEmpty();
    }

    /**
     * size return the size of the queue
     * @return the number of elements in queue
     */
    public int size()
    {
       return list.size();
    }

    /**
     * peek return the front element of the queue
     * @return the front element of the queue. If the queue is empty, return null
     */
    public E peek()
    {
        //the returning null is empty
        if (isEmpty()){
            return null;
        }
        //returning element at index 0
        return list.get(0);
    }

    /**
     * pop remove the front element of the queue
     */
    public void pop()
    {
       if (!isEmpty()){
           //removing the element at index 0
           list.remove(0);
           //then updating the tail index, since the lists is updated
           tail--;
        }
    }

    /**
     * push push a new element to the queue
     */
    public void push(E item)
    {
        //adding to the end
        list.add(item);
        //to update the tail index
        tail++;
    }
}
