package com.pack.lombokdemo;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode*/
@AllArgsConstructor

@Data
@Value
public class Emp {
	
	final String name;
	private int age;
	private float salary;
	private String designation;
	
	
	
	

}
