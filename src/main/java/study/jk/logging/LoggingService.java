package study.jk.logging;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class LoggingService {

    private String fileName;

    public String fname(){
        System.out.println("fName: " + this.fileName);
        return this.fileName;
    } 

    public void logging(String args) throws IOException{
        this.fileName = "Log" + Calendar.getInstance().getTime().toString() + ".txt";
        FileOutputStream output = new FileOutputStream(fileName);
        String str = "[" + Calendar.getInstance().getTime().toString() + "] " + args;
        byte[] bytes = str.getBytes();

        output.write(bytes);
        output.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (true) {
            String line = br.readLine();
            if (line == null){
                break;
            }
            System.out.println("Success Logging");
            System.out.println("The log is:");
            System.out.println(line);
        }
        br.close(); 
    }
}