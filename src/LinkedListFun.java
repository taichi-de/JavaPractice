import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFun {

  public static void main(String[] args) {
    LinkedList<Integer> linky = new LinkedList<Integer>();

    linky.add(6);
    linky.add(66);
    linky.add(666);

    System.out.println(linky.get(1));

    Iterator it = linky.iterator();
    while (it.hasNext()) {
      if((int) it.next() == 66){
        System.out.println("We found 66!");
      }
    }
  }
}
