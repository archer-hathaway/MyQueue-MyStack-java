
/**
 * class MyStack: A stack class implemented by using ArrayList
 * All stack elements are stored in an ArrayList. The top element
 * has in
 * @version 3/20/2020
 */
import java.util.ArrayList;

public class MyStack<E>
{
    private ArrayList<E> list; // used to store elements in stack
    private int top; // the index of top element

    /**
     * constructor construct an empty stack
     */
    public MyStack()
    {
        list = new ArrayList<E>();
        top = -1;
    }

    /**
     * push push a given element on the top of the stack
     */
    public void push(E item)
    {
        //adding to the end, incrementing the top
        list.add(item);
        top++;
    }

    /**
     * isEmpty return true if the stack is empty; false otherwise
     * @return true if the stack is empty; false otherwise
     */
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    /**
     * peek Return the top element
     */
    public E peek()
    {
      if(isEmpty()){

           return null;//stack that is empty
        }
        //to return element at the top index
        return list.get(top);
    }

    /**
     * pop Remove the top element from the stack. If the stack is empty,nothing happen
     */
    public void pop()
    {
       if (!isEmpty()){

           //remove the element at the top, then update the top index
           list.remove(top);
           top--;

        }
    }

    /**
     * size return the size of the stack
     * @return number of elements in stack
     */
    public int size()
    {
       return list.size();
    }
}
