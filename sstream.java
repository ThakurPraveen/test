import java.util.stream.*;


import java.util.*;
import java.util.Collection;

class sstream{
    public static void print(String a){
        System.out.println(a);
    }

    public static void main(String[] str){
         List<Integer> list = Arrays.asList(1,6,3,2,5);
         System.out.println(list);
    
         List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());
         System.out.println(square);

         List<Integer> greater = list.stream().filter(x->x>2).collect(Collectors.toList());
         System.out.println(
             greater
         );
         List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
         System.out.println(sort);

         list.stream().map(x->x*x).forEach(y->System.out.println(y));
         int reduc = list.stream().reduce(0,(ans,i)->ans+i);       
         System.out.println(reduc);       


         List<Integer> list1 = Arrays.asList(1,6,3,2,5,21,2,3,5,48,56,24,238,35,6,124,35,124,4,12,121,6);
         System.out.println(list1.stream().limit(10).collect(Collectors.toList()));

         Stream<String> empty = Stream.empty();
         Object[] obj1 = empty.toArray();
         System.out.println(Arrays.toString(obj1));

         Stream<String> stri = Stream.generate(()->"element").limit(10);
         Object[] ste = stri.toArray();
         System.out.println(Arrays.toString(ste));

         boolean result = list.stream().allMatch(x->x%1==0);
         System.out.println(result);

         List<String> strings = Arrays.asList("abc","aaaa","ssss","ddffa","sgdha","fgasfd","sgahdfa","sdhasf","gdah");
         
         strings.stream().mapToDouble(x->x.length()).forEach(y->System.out.println(y));

         strings.stream().filter(st->st.endsWith("a")).forEach(System.out::println);

         Integer var = list.stream().max(Integer::compare).get();
         System.out.println(var);



    }
    


}