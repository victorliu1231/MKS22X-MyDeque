public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = -1;
    end = -1;
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    if (start == -1 || end == -1){
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
        //System.out.println("incrementStart: "+incrementStart+", end: "+end);
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
    size++;
    if (start == -1){
      start = 0;
      end = 0;
    } else {
      if (start == 0){
        if (data[end] == null){
          start = data.length-1;
        } else {
          //resize
        }
      } else {
        start--;
      }
    }
    data[start] = element;
  }

  public void addLast(E element){
    size++;
    if (end == data.length - 1){
      if (data[0] == null){
        end = 0;
      } else {
        //resize
      }
    } else {
      if (start == -1){
        start = 0;
      }
      end++;
    }
    data[end] = element;
  }

  public E removeFirst(){
    E storer = data[start];
    if (start != data.length - 1){
      start++;
    } else {
      start = 0;
    }
    size--;
    return storer;
  }

  public E removeLast(){
    E storer = data[end];
    if (end != 0){
      end--;
    } else {
      end = data.length;
    }
    size--;
    return storer;
  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }

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

Size,Add, remove, and get should be O(1)
*/
