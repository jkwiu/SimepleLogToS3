package study.jk.logging;

import java.io.IOException;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.jk.logging.wio.person.Driver;
import study.jk.logging.wio.person.Student;

@RestController
public class ApiController {

    @GetMapping("/main")
    public String main() {
        return "HI, Guys~~\n This is JK's simple logging web application!! \n Have Fun~!!ßß";
    }

    // @GetMapping("log")
    // public String logging() throws IOException {
    //     LoggingService log = new LoggingService();
    //     log.logging();
    //     return "Log generated!!!!";
    // }

    @GetMapping("person/driver")
    public String setDriverName(
        @RequestParam String firstName, 
        String lastName,
        String companyName,
        String licenseNum,
        String phoneNumber,
        int year,
        int month,
        int day
        ) throws IOException {
        LoggingService log = new LoggingService();
        S3Service s3 = new S3Service();
        Driver d = new Driver();

        String fileName;

        d.setFirstName(firstName);
        d.setLastName(lastName);
        d.setCompanyName(companyName);
        d.setDOB(year, month, day);
        d.setLicenseNum(licenseNum);
        d.setPhoneNumber(phoneNumber);
        
        Gson g = new Gson();
        String json = g.toJson(d);
        System.out.println(json);
        
        log.logging(json);
        fileName = log.fname();
        s3.upload(fileName);
        
        return json;
    }

    @GetMapping("person/student")
    public String setStudentName(
        @RequestParam String firstName, 
        String lastName,
        String collegeName,
        String eduProgram,
        String collegeNum,
        String phoneNumber,
        int year,
        int month,
        int day
        ) throws IOException {
        LoggingService log = new LoggingService();
        S3Service s3 = new S3Service();
        Student s = new Student();

        String fileName;

        s.setFirstName(firstName);
        s.setLastName(lastName);
        s.setCollegeName(collegeName);
        s.setDOB(year, month, day);
        s.setCollegeNum(collegeNum);
        s.setEduProgram(eduProgram);
        s.setPhoneNumber(phoneNumber);
        
        Gson g = new Gson();
        String json = g.toJson(s);
        System.out.println(json);
        
        log.logging(json);
        fileName = log.fname();
        s3.upload(fileName);
        
        return json;
    }
}