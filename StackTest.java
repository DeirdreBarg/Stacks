/**
 * StackTest
 */
public class StackTest {

    public static void main(String[] args) throws Exception {
        // pushTest1();
        popTest1();
        
        
    }

    public static void pushTest1() throws Exception {
        Stack s = new Stack(10);
        s.push(20);
        s.push(15);
        s.push(34);
        s.push(5);
        System.out.println(s.getSizeSoFar());

    }

    public static void popTest1() throws Exception {
        Stack s = new Stack(10);
        s.push(20);
        s.push(15);
        s.push(34);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}