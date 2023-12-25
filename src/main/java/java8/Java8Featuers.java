package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Java8Featuers {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> test = (a,b)-> System.out.println(a + b);
		test.accept(1, 2);
		
		BiConsumer<String, String>	testString = (c,d)-> System.out.println(c+d);
		testString.accept("hi", "hello");
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		List<Integer> b = new ArrayList<Integer>();
		Stream st = a.stream();
		System.out.println(st+"st");
		//b = a.stream().filter(x -> x>1).collect(Collectors.toList());
		//even numbers
//		b = a.stream().filter(x -> x%2==0).collect(Collectors.toList());
//		b.forEach(z -> System.out.println(z));
		
		// in single line
		a.stream().filter(x -> x%2==0).forEach(z -> System.out.println(z));
		
		// Stream processing configuration
		//collect method
		List<Integer> collectMethod = a.stream().filter(y -> y>1).collect(Collectors.toList());
		collectMethod.forEach( m -> System.out.println(m+"Collect method"));
		
		
		//count method
		
	long countMethod = a.stream().filter(n -> n>1).count();
	System.out.println(countMethod+"countMethod method");
		//countMethod.forEach( o -> System.out.println(m+"countMethod method"));
	
	
	//sorted Asc
	
Stream<Integer> sortedNMethod = a.stream().filter(y -> y>1).sorted();
	sortedNMethod.forEach( m -> System.out.println(m+"sortedNMethod method"));
	
	//sorted desc
	
Stream<Integer> sortedDescNMethod = a.stream().filter(y -> y>1).sorted((c1,c2)-> c2.compareTo(c1));
sortedDescNMethod.forEach( m -> System.out.println(m+"sortedDescNMethod method"));

//min method

	Integer minMethod = a.stream().min((i1,i2)-> i1.compareTo(i2)).get();
	 System.out.println(minMethod+"minMethod method");
			
	 
	//max method

		Integer maxMethod = a.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		 System.out.println(maxMethod+"maxMethod method");
		 
		 
		 // of method
		  // it will take any group values
		 // of method by taking integer values
		 Stream.of(1,2).forEach(f -> System.out.println(f + "of method with Integer values "));
		 
		 
		// of method by taking string values
				 Stream.of("A","B").forEach(f -> System.out.println(f + "of method with String values"));
				 
				 List<Integer> numbers = new ArrayList<Integer>();

				 Optional<Integer> sumOptional = numbers.stream().reduce((k, g) -> k + g);
				 int sum = sumOptional.orElse(0);
				 System.out.println("Sum: " + sum); // Output: Sum: 15
				 
				 //Find the duplicates by using strezams
				 
				 List<Integer> duplicateTest = Arrays.asList(1,1,1,2,2,2,2,3,3
						 ,4);
				Set<Integer> setDuplicate  = new HashSet<Integer>();
				duplicateTest.stream().filter(set -> !setDuplicate.add(set)).collect(Collectors.toSet()).forEach(System.out::println);
				
	//mulyiplication of 2 no 
				
				FunctionalInterfaceClassTest multi =  (w,e) -> w*e;
				System.out.println(multi.multplyTwoNumbers(5, 2));
				
				
				
				// count the no of occurence of words
				
				
//				Set<String> testWord = new HashSet<String>();
//				
//				System.out.println(Stream.of("My name is Abhishek full name is Abhishek Moola").filter(dt -> dt.contains("Abhishek")).count());
//			Stream.of("My name is Abhishek full name is Abhishek Moola").map().collect(null, null, null);
				String ss = "My name is Abhishek full name is Abhishek Moola";
				List<String>  splitArrayTestList = Arrays.asList(ss.split(" "));
				Map<String, Long> map =splitArrayTestList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				System.out.println(map);
				
				
				
				
	
	
		}

		
	
	
	/*
	 * public static int add(int a, int b) { (a,b)-> System.out.println();
	 * System.out.println(a+b);
	 * 
	 * 
	 * return 0;
	 * 
	 * }
	 */
	
	

}
