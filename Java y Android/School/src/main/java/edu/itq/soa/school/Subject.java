/**
 * 
 */
package edu.itq.soa.school;

/**
 * @author arthur
 *
 */
public class Subject {
    private Student[] student = new Student[50];
    public Subject() {
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].setName("Name"+i);
            student[i].setLastName("LastName"+i);
            student[i].setAge(i);
            System.out.println("Name "+student[i].getName()+
                    "LastName: "+student[i].getLastName()+
                    "Age: "+student[i].getAge());
        }
    }
}
