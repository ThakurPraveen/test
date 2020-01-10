import java.util.*;
class ArrayLi{
  public static void main(String arg[]){
    
    ArrayList<Integer> arrli = new ArrayList<Integer>();
    arrli.add(1);
    arrli.add(2);
    arrli.add(3);
    arrli.add(4);
    
    System.out.println(arrli);

    arrli.remove(2);

    System.out.println(arrli);
}
}
