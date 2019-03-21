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
    String ans = "{";
    int incrementStart = start;
    if (start < end){
      while (incrementStart <= end){
        ans+= data[incrementStart] + " ";
        incrementStart++;
      }
    } else {
      while (incrementStart != end+1){
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
    if (start == 0){
      data[start] = element;
    }
    //finish the rest at home
  }

  public void addLast(E element){
    size++;
    if (end != data.length - 1){
      end++;
    } else {
      if (data[0] == null){
        end = 0;
      } else {
        //resize
      }
    }
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
}

/*
Add: (push / en-queue)
Get: return but NOT remove the element. (peek)
Remove: return AND remove the element. (pop / de-queue)

Size,Add, remove, and get should be O(1)
toString O(n) - format:  {a b c d }  / {}  /   {VALUE_VALUE2_VALUE3_}  (space after each value)
*/
