package study.jk.logging;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class LoggingService {

    public void logging() throws IOException{
        FileOutputStream output = new FileOutputStream("out.txt");
        String str = "JK test string" + Calendar.getInstance().getTime() + " YEP!! YEP!! YEP!!.\n";
        byte[] bytes = str.getBytes();

        output.write(bytes);
        output.close();

        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null){
                break;
            }
            System.out.println(line);
        }
        br.close(); 
    }
}