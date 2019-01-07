package com.itq.soa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.itq.soa.student.Student;

public class Materia{
    /**
     * Contructor que genera un grupo dummy
     * @param groupSize
     */
    
    List<Student> grupo;
    public Materia(int groupSize) {
        grupo = new ArrayList<Student>();
        for (int i = 0; i < groupSize; i++) {
            Student student = new Student("Estudiante"+i,"Apellido"+i,i+20);
            grupo.add(student);
        }
        
    }
    
    
	public void listar() {
		for (Student student:grupo) {
            System.out.println(student.getName()+", "+student.getAge());
        }
		
		for (int i = 0; i < grupo.size(); i++) {
            System.out.println(grupo.get(i).getName()+", "+grupo.get(i).getAge());
        }
	}
	
	public static void main(String[] args) {
//		Student student = new Student("Gonzalo","Díaz",33);
//		student.saludar();
		Materia subject = new Materia(10);
		subject.listar();
	}
}
