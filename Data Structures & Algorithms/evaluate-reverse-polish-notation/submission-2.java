class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        int eval = 0;
       for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") &&
                !token.equals("*") && !token.equals("/")) {
              st.push(Integer.parseInt(token));
            }
         else {
            char ch = token.charAt(0);
            if(ch == '+'){
                int first = st.pop();
                int second = st.pop();
                eval = second + first;
                st.push(eval);
            }else if(ch == '*'){
                int first = st.pop();
                int second = st.pop();
                eval = second * first;
                st.push(eval);
            }else if(ch == '-'){
                int first = st.pop();
                int second = st.pop();
                eval = second - first;
                st.push(eval);
            }else{
                int first = st.pop();
                int second = st.pop();
                eval = second / first;
                st.push(eval);
            }
        }
    }
     return st.pop();
    }
}
