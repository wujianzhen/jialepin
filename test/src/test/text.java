package test;

import java.util.ArrayList;
import java.util.List;

public class text {
     public static void main(String[] vag){
         List list = new ArrayList<>();
         list.add("String");
         list.add("double");

         list.forEach(e -> System.out.println((String) e));

     }
     class tast{
         void name(List list){
             list.forEach(e-> System.out.println("111111111"));
         }
     }
}
