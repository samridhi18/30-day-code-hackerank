public class Solution {
    // Write your code here.
    Stack<Character> st = new Stack<Character>();
    Queue<Character> q = new LinkedList<Character>();

    void pushCharacter(char ch) {
        st.push(ch);
    }

    void enqueueCharacter(char ch) {
        q.add(ch);
    }

    char popCharacter() {
        return st.pop();
    }

    char dequeueCharacter() {
        return q.poll();
    }

