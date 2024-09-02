package codingInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Plese Refer below Link for more examles:

//https://bakii.medium.com/a-deep-dive-into-the-flatmap-operation-of-the-stream-api-in-java-with-examples-57c97224c01d
public class Set12_FlatMap {
	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<>();
		peopleList.add(new Person("John", Arrays.asList("1234", "5678")));
		peopleList.add(new Person("Bob", Arrays.asList("91011")));
		peopleList.add(new Person("Charlie", Arrays.asList("121314", "151617", "181920")));
		List<String> allPhoneNumbers = peopleList.stream().flatMap(people -> people.getPhoneNumbers().stream()) 
				.collect(Collectors.toList());
		System.out.println(allPhoneNumbers);
		
		mergeElementsOfList();
	}
	
	//Parsing and Flattening Strings
	public static void mergeElementsOfList(){
		List<String> inputStrings = Arrays.asList("1,2,3", "4,5", "6,7,8");
		List<Integer> allNumbers = inputStrings.stream()
		        .flatMap(str -> Arrays.stream(str.split(",")) // Splitting each string into numbers
		                .map(Integer::parseInt) // Converting each number from string to integer
		        ).collect(Collectors.toList());
		      
		System.out.println(allNumbers);
	}
	
}

class Person {
	private String name;
	private List<String> phoneNumbers;

	public Person(String name, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
