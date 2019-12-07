package study.jk.logging.wio.person;

import java.time.LocalDate;


abstract class Person {

    final public static int numberOfLegs = 2;
    private String firstName;
    private String lastName;
    private String dob;
    private String phoneNumber;


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

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDOB(int year, int month, int day){
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        this.dob = dateOfBirth.toString();
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDOB(){
        return dob;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

}