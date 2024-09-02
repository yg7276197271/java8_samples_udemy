package codingInterviewQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1{
	private Integer empId;
	private String name;
	private Integer age;
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	
	
	
}
public class Set13 {

	public static void main(String[] args) {
		//How to combine two List using Stream API's
		//1.concat method
		List<Employee1> list1 = new ArrayList<>();
		List<Employee1> list2 = new ArrayList<>();
		
		Stream<Employee1> combinedStream  = Stream.concat(
				list1.stream(),
				list2.stream());
		
		combinedStream.filter(emp ->emp.getAge()>20).collect(Collectors.toList());
		
		//2.flatmap
		
		Stream<Employee1> combinedStream1 = Stream.of(list1, list2).flatMap(Collection::stream);
		combinedStream1.collect(Collectors.toList());
	}
	
}
