import java.util.NoSuchElementException;

public class VDriver{
  public static void main(String[]args){
    System.out.println(Calculator.eval("1 2 3 + +")); //should be 6.0
    System.out.println(Calculator.eval("10 2.0 +"));// is 12.0
    System.out.println(Calculator.eval("11 3 - 4 + 2.5 *"));// is 30.0
    System.out.println(Calculator.eval("8 2 + 99 9 - * 2 + 9 -"));// is 893.0
    System.out.println(Calculator.eval("1 2 3 4 5 + * - -"));// is 26.0


    /*
    MyDeque<Integer> d1 = new MyDeque<>();
    System.out.print(d1+" "); System.out.println(d1.size());//{}, 0
    d1.addLast(1); d1.addLast(2); d1.addLast(3); //{1 2 3 }, 3
    System.out.print(d1+" "); System.out.println(d1.size());
    System.out.println(d1.removeFirst()); //{2 3 }, 2
    System.out.print(d1+" "); System.out.println(d1.size());
    System.out.println(d1.removeLast()); //{2 }, 1
    System.out.print(d1+" "); System.out.println(d1.size());
    System.out.println(d1.removeFirst()); //{}, 0
    System.out.print(d1+" "); System.out.println(d1.size());
    for (int i = 0; i < 29; i++){
      d1.addFirst(i);
    }
    d1.addLast(-1);
    System.out.print(d1+" "); System.out.println(d1.size());
    for (int i = 0; i < 5; i++){
      System.out.println(d1.removeLast());
    }
    System.out.print(d1+" "); System.out.println(d1.size());
    for (int i = 3; i > -29; i--){
      d1.addLast(i);
    }
    System.out.print(d1+" "); System.out.println(d1.size());
    for (int i = 0; i < 57; i++){
      System.out.println(d1.removeFirst());
    }
    System.out.print(d1+" "); System.out.println(d1.size());

    MyDeque<Integer> d2 = new MyDeque<>(1);
    for (int i = 0; i < 10; i++){
      if (i == 6 || i == 5){
        d2.removeLast();
      }
      d2.addFirst(i);
      System.out.println(d2);
    }
    System.out.println(d2.getFirst());
    System.out.println(d2.getLast());
    
    int exceptions = 0;
    try {
      System.out.println(d1.removeFirst());
    } catch (NoSuchElementException e){
      exceptions++;
    }

    try {
      d1.removeLast();
    } catch (NoSuchElementException e){
      exceptions++;
    }

    try {
      d1.getFirst();
    } catch (NoSuchElementException e){
      exceptions++;
    }

    try {
      d1.getLast();
    } catch (NoSuchElementException e){
      exceptions++;
    }

    try {
      d1.addFirst(null);
    } catch (NullPointerException e){
      exceptions++;
    }

    try {
      d1.addLast(null);
    } catch (NullPointerException e){
      exceptions++;
    }

    if (exceptions == 6){
      System.out.println("SUCCESS");
    }
    */
  }
}
