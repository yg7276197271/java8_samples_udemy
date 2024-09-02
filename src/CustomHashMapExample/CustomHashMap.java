package CustomHashMapExample;
import java.util.*;
public class CustomHashMap {
	 public static void main(String[] args) {
	        Student student1 = new Student(1,"John");
	        Student student2 = new Student(2,"Mayer");
	        Student student3 = new Student(1,"John");
	        Map<Student,Integer> map = new HashMap<>();
	        map.put(student1, 1);
	        map.put(student2, 2);
	        map.forEach((K,V) -> System.out.println("Existing values in the map: " + V));
	        System.out.println();
	        
	        map.put(student1, 3);
	        map.forEach((K,V) -> System.out.println("Existing values in the map: " + V));
	        System.out.println();
	        System.out.println(map.containsKey(student1));
	        System.out.println(map.containsKey(student3)); //If we override equals method then only it will return true
	        //The reason is HashMap contains student object as id =3 and name=John .
	        //So the reference of Student 1 and 3 are different but still their instance parameter values are same
	        
	        map.put(student3, 4);
	        map.forEach((K,V) -> System.out.println("Existing values in the map: " + V));
	        System.out.println();

	        map.put(student3, 6);
	        map.forEach((K,V) -> System.out.println("Existing values in the map: " + V));

	    }
}
