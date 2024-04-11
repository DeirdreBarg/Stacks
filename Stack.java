/**
 * Stacks
 */
public class Stack {
private int [] data;

    Stack(int capacity) {
        data = new int[capacity];
    }
    private int topPointer = -1;


    /**
     * Checks to see if data is empty 
     * @param topPointer the index of the last element added
     * @return true is empty and false if not
     */
    public boolean empty( int topPointer){
        if (topPointer == -1) {
            return true;
        }
        return false;
    }

    /**
     * removes the elemen† on the top of the stack
     * returns null if stack is empty
     * @return the int that was removed
     */
    public Integer pop() {
        int result = 0;
        if (!empty(topPointer)) {
            result = data[topPointer];
            topPointer--;
        }
        else if (empty(topPointer)) {
            return null;
        }
        
        return result;
    }

     /**
      * puts the int n on the top of the stack 
      * @param n theint that the client wants to add to the stack
     * @throws Exception 
      */
    public void push(int n) throws Exception {
        if (topPointer == data.length) {
            throw new Exception();
        }
        topPointer++;
        data[topPointer] = n;
    }
    
    /**
     * Gets the amount of elements pushed so far
     * @return the number of elements added
     */
    public int getSizeSoFar() {
        return topPointer + 1;
    }
}