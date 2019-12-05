package study.jk.logging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import study.jk.logging.wio.animal.Animal;
import study.jk.logging.wio.animal.Eagle;
import study.jk.logging.wio.person.Driver;
import study.jk.logging.wio.person.Student;


@SpringBootTest
class DemoApplicationTests {

	@Test
	public static void main(String[] args) {
		Driver d = new Driver();

		d.setDOB(1989, 11, 11);
		d.setFirstName("kim");
		d.setLastName("ys");
		d.setLicenseNum(109109109);
		d.setCompanyName("yello taxies");
		d.drive();

		System.out.println("Date of Birth: " + d.getDOB());  
		System.out.println("first name: " + d.getFirstName() + ", last name: " + d.getLastName());
		System.out.println("Company Name: " + d.getCompanyName());
		System.out.println("License Num: " + d.getLicenseNum());
		System.out.println("number of legs: " + d.numberOfLegs);

		Student s = new Student();

		s.setDOB(1111, 12, 1);
		s.setFirstName("lim");
		s.setLastName("um");
		s.move();
		s.move("home", "school");
		s.setEduProgram("phd");
		s.setCollegeNum(10101010);
		s.setCollegeName("sky");
		s.study();
		
		System.out.println("Date of Birth: " + s.getDOB());  
		System.out.println("first name: " + s.getFirstName() + ", last name: " + s.getLastName());
		System.out.println("College Name: " + s.getCollegeName());
		System.out.println("College Num: " + s.getCollegeNum());
		System.out.println("Educating Program: " + s.getEduProgram());

		Eagle e = new Eagle();

		System.out.println("number of eyes: " + Animal.numberOfEyes);
		e.fly();
	}

}
