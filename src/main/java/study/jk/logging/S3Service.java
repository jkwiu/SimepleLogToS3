package study.jk.logging;

import java.io.File;
import java.nio.file.Paths;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3Service implements Runnable {

    public void uploadS3(){
        S3Client s3 = S3Client.create();
        s3.putObject(PutObjectRequest.builder().bucket("jk.test").key("logs/test.txt").build(), RequestBody.fromFile(Paths.get("out.txt")));
        System.out.println("스레드이름 업로드 펑션:"+Thread.currentThread().getName());

    }

    @Override
    public void run() {
        
            File file = new File("out.txt");
            
            try {
                while (true) {
                    boolean exists = file.exists();
                    if(exists){
                        uploadS3();
                        file.delete();
                        System.out.println("Uploaded Log File to S3 bucket");
                        long start = System.currentTimeMillis();
                        Thread.sleep(5000);
                        long end = System.currentTimeMillis();
                        System.out.print("execution time: " + (end - start)/1000.0 + "\n");
                    } else {
                        System.out.println("No File to upload");
                        long start = System.currentTimeMillis();
                        Thread.sleep(5000);
                        long end = System.currentTimeMillis();
                        System.out.print("execution time: " + (end - start)/1000.0 + "\n");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}