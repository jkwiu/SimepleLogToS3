package study.jk.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class DemoApplication {

	// http://localhost:8080/person/driver?firstName=kim&&lastName=sunwoo&&companyName=Samsung&&licenseNum=10101010&&phoneNumber=01012345678&&year=1986&&month=1&&day=2
	// http://localhost:8080/person/student?firstName=kim&&lastName=sunwoo&&collegeName=SKY&&collegeNum=10101010&&phoneNumber=01012345678&&year=1986&&month=1&&day=2&&eduProgram=phd
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}