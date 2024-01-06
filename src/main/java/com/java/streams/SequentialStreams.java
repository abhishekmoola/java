package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class SequentialStreams {
	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1,2,3,4,5);
		//sequential stream
		list.stream().map(n -> n*n)
		.forEach(System.out::println);
		
		//output like
//		1
//		4
//		9
//		16
//		25

	}

}
