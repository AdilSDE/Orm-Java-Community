package com.sourcefuse.userintentservicess;

import com.sourcefuse.userintentservicess.DTO.Books;
import com.sourcefuse.userintentservicess.DTO.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class UserintentservicessApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UserintentservicessApplication.class, args);
//		Books books= new Laptop();
//
//		Laptop laptop= (Laptop) books;
//		System.out.println(laptop);
//
//		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
//		String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
//		List<String> lis=new ArrayList<>();
//		lis.addAll(Arrays.asList(names2));
//		lis.addAll(Arrays.asList(names1));
//		Set<String> set=new HashSet<>();
//		System.out.println( lis.stream().filter(x->set.add(x)).toList().toArray());
//		Integer i=Integer.valueOf('c');
//		String s="ad"+'v';
//		System.out.println(s);
//		System.out.println(i);
//		new String(new char[]{'a','f'});
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());

	}
	public static class TextInput {
		String val;

		public String getValue() {
			return val;
		}

		public void add(char cha) {
			val=val+cha;
		}
	}

	public static class NumericInput extends TextInput{

		public void add(char cha) {
			val=val+cha;
			val=val.replaceAll("[^0-9]","");
		}
	}
	}

