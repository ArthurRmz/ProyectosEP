package com.itq.soa.student;
/**
 * Student data
 * @author arthur
 *
 */
public class Student {
	/** 
	 * Student name
	 * Student last name
	 * Student age 
	 */
	private String name;
	private String lastName;
	private int age;
	
	/**
	 * @param name nombre del estudiante
	 * @param lastName apellido del estudiante
	 * @param age edad del estudiante
	 */
	public Student(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * Generacion de un estudiante sin datos
	 */
	public Student() {
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Emitir saludo
	 */
	public void saludar() {
		System.out.println("Hola, yo soy "+this.name+" "+this.lastName);
		
	}
}
