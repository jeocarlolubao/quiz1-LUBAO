/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1lubao;

/**
 *
 * @author Jeo
 */
public class Person {
    
    private String firstName, lastName, address; // Create a class named Person with at least the following fields: firstname, lastname, address.
    
    public Person(String firstName, String lastName, String address){ // Create a constructor that initializes the fields.
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    
    // Generate the get and set accessor methods.
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    
    
}
