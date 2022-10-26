package com.example.lambda;

import java.util.List;

/**
 *
 * @author
 */
public class RoboCallTest06 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    
    System.out.println("\n=== Print List ===");
    pl.forEach(p -> System.out.println(p));
    
    for(Person p:pl)
        System.out.println(p);
        
  }
}
