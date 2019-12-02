package study.jk.logging;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		S3Service s3Service = new S3Service();
		Thread thread = new Thread(s3Service);
		thread.setDaemon(true);
		thread.start();
		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if(str.equals("stop")){
				thread.interrupt();
				System.out.println("stoped!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				sc.close();
				break;
			}
		}
	}
}