public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] elements = s.split(" ");
      String ops = "+-*/%";
      MyDeque<Double> deq = new MyDeque<>(elements.length);
      for (int i = 0; i < elements.length; i++){
        if (ops.contains(elements[i])){
          double prev = deq.removeLast();
          double prevPrev = deq.removeLast();
          if (elements[i].equals("+")){
            deq.addLast(prevPrev + prev);
          } else if (elements[i].equals("-")){
            deq.addLast(prevPrev - prev);
          } else if (elements[i].equals("*")){
            deq.addLast(prevPrev * prev);
          } else if (elements[i].equals("/")){
            deq.addLast(prevPrev / prev);
          } else {
            deq.addLast(prevPrev % prev);
          }
        } else {
          deq.addLast(Double.parseDouble(elements[i]));
        }
      }
      return deq.removeLast();
    }
}
