package Apnacollege;

import java.util.*;

class LinkedListt {
   public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       System.out.println(list);
       list.add("is");
       list.add("a");
       list.addLast("hjvkgbuj");
       list.addFirst("this");
       list.add(3, "linked");

       System.out.println(list);
       list.removeFirst();
       System.out.println(list);
       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(3);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
       
      ArrayList<String> arraylist = new ArrayList<String>();
      arraylist.add("hello");
      System.out.println(arraylist);
      arraylist.add(0, "jhgjh");
      System.out.println(arraylist);
      arraylist.add("uiyuy");
      arraylist.add("afdvg");
      arraylist.add("wewe");
      System.out.println(arraylist);
      
      List<String> mylist = new LinkedList<>();
      LinkedList<String> mylinklist = new LinkedList<>();
      List<String> mtlist2 = new ArrayList<String>();
     //List Vs ArrayList Vs LinkedList
      ArrayList<Float32> dffd =  new ArrayList<>();
      ArrayList <Integer> list2=new ArrayList<Integer>();  //object of ArrayList  
      list2.add(12);
      System.out.println(list2);
   }
}

