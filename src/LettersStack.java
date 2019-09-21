import java.util.Collections;
import java.util.LinkedList;

public class LettersStack {

    public static void main(String[] args) {

        LinkedList<String> letterStack = new LinkedList<String>();

        //adding the elements from top of stack
        letterStack.push("A");
        letterStack.push("B");
        letterStack.push("C");
        letterStack.push("D");

        //method used to sort collections
        Collections.sort(letterStack);

        System.out.println("Linked list : " + letterStack);
        System.out.println("LinkedList : " + letterStack.size());

        //removing (pop) elements from stack
        while(!letterStack.isEmpty()){

            System.out.println(letterStack.pop());

        }

        System.out.println("linked list : " + letterStack);

    }

}
