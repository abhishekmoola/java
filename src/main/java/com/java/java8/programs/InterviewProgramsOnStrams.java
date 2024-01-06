package com.java.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InterviewProgramsOnStrams {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(25, "A", "M", 10000));
		emp.add(new Employee(24, "B", "F", 20000));
		emp.add(new Employee(27, "C", "M", 30000));
		
		List<Employee> filterData= emp.stream().filter((e1) -> e1.getAge()>25)
		.collect(Collectors.toList());
		filterData.forEach(e3 -> System.out.println( e3.getAge() + "AGE" + e3.getName() + "NAME"));
		//List<Employee> f =	filterData.forEach(e -> e.setSalary(e.getSalary()+10)).collect(Collectors.toList());
		
		
			String s1 = "ABC";
			String s2 = "ABC";
			String s3 = "ABCDsss";
			String s4 = new String("ABC88");
			System.out.println(s1==s3);
			System.out.println(s1==s4);
			
			System.out.println(s1.equals(s3));
			System.out.println(s3.equals(s4));
			
			System.out.println(s3.compareTo(s1));
			System.out.println(s1.compareTo(s4));
			
			
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Using map() to square each element in the list
	        List<Integer> squaredNumbers = numbers.stream()
	                                              .map(n -> n * n)
	                                              .collect(Collectors.toList());

	        System.out.println("Original Numbers: " + numbers);
	        System.out.println("Squared Numbers: " + squaredNumbers);
	        
//	       //find the even numbers from the list
//	        List<Integer> evenNumbers = numbers.stream().filter(a -> (a%2==0)).toList();
//	     iNm   evenNumbers = numbers.stream().filter(a -> (a%2==0)).toList();
//	        System.out.println("EVEN NUMBERS" + evenNumbers);
//		
//		
	}

}
