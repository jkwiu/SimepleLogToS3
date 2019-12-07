package study.jk.logging.wio.person;

public class Driver extends Person {

    private String licenseNum;
    private String companyName;

    @Override
    public void move() {
        System.out.println("Driver is walking");
    }

    public void drive(){
        System.out.println("Driver is driving.......");
    }

    public void setLicenseNum(String licenseNum){
        this.licenseNum = licenseNum;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getLicenseNum(){
        return licenseNum;
    }

    public String getCompanyName(){
        return companyName;
    }
}