import java.util.NoSuchElementException;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    if (size == 0){
      return "{}";
    }
    String ans = "{";
    int incrementStart = start;
    if (start <= end){
      while (incrementStart <= end){
        ans+= data[incrementStart] + " ";
        incrementStart++;
      }
    } else {
      while (incrementStart != end+1){
        //this allows the list to loop back on itself
        ans+= data[incrementStart] + " ";
        if (incrementStart == data.length){
          incrementStart = 0;
        } else {
          incrementStart++;
        }
      }
    }
    ans+= "}";
    return ans;
  }


  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if (size != 0){
      //if you reached the front end by doing start--'ing
      if (start == 0){
        //if there's empty space at the end...
        if (data[end] == null){
          start = data.length-1;
        } else {
          resize();
          start = data.length-1;
        }
      } else {
        start--;
      }
    }
    size++;
    data[start] = element;
  }

  public void addLast(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if (end == data.length - 1){
      //if there's empty space in the beginning
      if (data[0] == null){
        end = 0;
      } else {
        resize();
        end++;
      }
    } else {
      if (size != 0){
        end++; //if we're just adding for the first time, then end should not increment away from start
      }
    }
    size++;
    data[end] = element;
  }

  public E removeFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E storer = data[start];
    if (start != data.length - 1){
      start++;
    } else { //if you need to loop back to the beginning
      start = 0;
    }
    size--;
    return storer;
  }

  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E storer = data[end];
    if (end != 0){
      end--;
    } else { //if you need to loop back to the end
      end = data.length;
    }
    size--;
    return storer;
  }

  public E getFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return data[start];
  }

  public E getLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return data[end];
  }

  private void resize(){
    E[] newAry = (E[])new Object[data.length * 2 + 1];
    for (int n = 0; n < data.length; n++){
        newAry[n] = data[n];
    }
    data = newAry;
  }

  //for debugging purposes
  public String toStringActual(){
    String ans = "{";
    for (int i = 0; i < data.length; i++){
      ans+= data[i]+" ";
    }
    ans+= "}";
    return ans;
  }
}

/*
Add: (push / en-queue)
Get: return but NOT remove the element. (peek)
Remove: return AND remove the element. (pop / de-queue)
*/
