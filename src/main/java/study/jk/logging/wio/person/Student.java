package study.jk.logging.wio.person;

public class Student extends Person {

    private String collegeNum;
    private String collegeName;
    private String eduProgram;

    public void move(String from, String to) {
        System.out.println("Student is running to " + to + " from " + from );
    }

    @Override
    public void move() {
        System.out.println("Student is moving");
    }

    public void study(){
        System.out.println("Student is studying");
    }

    public void setCollegeNum(String collegeNum){
        this.collegeNum = collegeNum;
    }

    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public void setEduProgram(String eduProgram){
        this.eduProgram = eduProgram;
    }

    public String getCollegeNum(){
        return collegeNum;
    }

    public String getCollegeName(){
        return collegeName;
    }

    public String getEduProgram(){
        return eduProgram;
    }

}