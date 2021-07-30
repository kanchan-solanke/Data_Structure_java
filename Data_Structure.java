import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        //expr 
        String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);   // to check each char
            if(c =='('){
                st.push(c);
            }else if(c == ')'){
                st.pop();
            }
        }
        //isEmpty() method in Java is used to check and verify if a Stack is empty or not.
        // It returns True if the Stack is empty else it returns False
        System.out.println("<---BALANCED --->"+st.isEmpty());
    }
}