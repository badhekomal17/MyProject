package com.zensar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamTest {

	public static void main(String[] args) {
		
		List<Integer> no = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		 // Here Using Filter
		Stream<Integer> stream = no.stream();
		Stream<Integer> fl = stream.filter(i->i%2==0); 
		System.out.println("Using filter():-");
		fl.forEach(System.out::println);
		
		System.out.println("Create new stream and used filter():-");
		no.stream().forEach(System.out::println);
		
		
		// Here Using Map
		System.out.println("Using Map():-");
		IntStream.of(1,2,3,4,5,6,7,8,9,10).map(n->n*10)
		.forEach(System.out::println);
		
		
		// Using Count()
		System.out.println("Total no.of Count:- " +IntStream.of(1,2,3,4,5,6,7,8,9,10).map(n->n*10).count());
		
		
		// Print 1 to 15 no.with Stream but without using for loop
		IntStream.iterate(1, n->n+1)
		.limit(15)
		.forEach(System.out::println);
		
		}
}
