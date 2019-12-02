package study.jk.logging;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		S3Service s3Service = new S3Service();
		Thread thread = new Thread(s3Service);
		thread.setDaemon(true);
		thread.start();
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			if(str.equals(" ")){
				thread.interrupt();
				System.out.println("stoped!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;
			}
		}
		sc.close();
	}
}