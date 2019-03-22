import java.util.NoSuchElementException;

public class VDriver{
  public static void main(String[]args){
    MyDeque<Integer> d1 = new MyDeque<>();
    System.out.print(d1+" "); System.out.println(d1.size());//{}, 0
    d1.addLast(1); d1.addLast(2); d1.addLast(3); //{1 2 3 }, 3
    System.out.print(d1+" "); System.out.println(d1.size());
    d1.removeFirst(); //{2 3 }, 2
    System.out.print(d1+" "); System.out.println(d1.size());
    d1.removeLast(); //{2 }, 1
    System.out.print(d1+" "); System.out.println(d1.size());
    d1.removeFirst(); //{}, 0
    System.out.print(d1+" "); System.out.println(d1.size());
    int exceptions = 0;
    try {
      d1.removeFirst();
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
  }
  //tested all exceptions

  //need to test resizing, getFirst, getLast, removeLast (for looping back),
  //removeFirst (for looping back), addFirst (for looping back and resizing),
  //addLast (for looping back and resizing), toString for when the list is looped
  //size when list is looped, and instantiating MyDeque with initialcapicity constructor
}
