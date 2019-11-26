package study.jk.logging;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class LoggingService {

    public void logging() throws IOException{
        FileOutputStream output = new FileOutputStream("out.txt", true);
        for(int i=0; i<10; i++){
            String str = "JK test string" + i + " YEP!! YEP!! YEP!!.\n";
            byte[] bytes = str.getBytes();
            output.write(bytes);
        }
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