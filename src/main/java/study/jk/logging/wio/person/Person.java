package study.jk.logging.wio.person;

import java.time.LocalDate;

abstract class Person {

    final public int numberOfLegs = 2;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int phoneNumber;

    abstract void move();

    public void sleep(){
        System.out.println("Sleeping.........");
    }

    public void eat(){
        System.out.println("Eating...........");
    }

    public void label(){
        System.out.println("Person's Data");
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }

    public void setDOB(int year, int month, int day){
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        this.dob = dateOfBirth;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public LocalDate getDOB(){
        return dob;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }
}