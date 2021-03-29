package Lesson_8_Collections_Streams_Filters.Practice2;

import java.util.List;
import java.util.function.Predicate;


public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();    
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs");
    pl.stream()
      .filter(p -> p.getRole().equals(Role.EXECUTIVE))
      .filter(p -> p.getDept().equals("Sales"))
      .forEach(p -> robo.roboMail(p));    
  }
}
