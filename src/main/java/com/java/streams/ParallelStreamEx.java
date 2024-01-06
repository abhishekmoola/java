package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamEx {
	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1,2,3,4,5);
		//parallel  stream,  when tio use parrallel stram keyword
		list.parallelStream().map(n -> n*n)
		.forEach(System.out::println);
		
		//output like bcz it is used mutiple threads
//		9
//		25
//		16
//		4
//		1

	}

}
