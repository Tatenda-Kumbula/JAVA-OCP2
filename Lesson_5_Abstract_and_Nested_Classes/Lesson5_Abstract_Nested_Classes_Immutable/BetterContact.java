
package Lesson5_Abstract_Nested_Classes_Immutable;


import java.util.Date;

public final class BetterContact {

    private String firstName;
    private String lastName;
    private Date dob;

    public BetterContact(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = new Date(dob.getTime()); //Date ia mutable object, can be modified by using Date.setXXX() hence to prevent that
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }
}