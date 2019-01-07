/**
 * 
 */
package edu.itq.soa.school;

/**
 * @author arthur
 *
 */
public class School {
    private String name;
    private String address;
    Subject[] groups = new Subject[100];
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    public School() {
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new Subject();
            System.out.println("Materia"+(i+1));
        }
    }
}
