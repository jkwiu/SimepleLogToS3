package study.jk.logging;

import java.io.File;
import java.nio.file.Paths;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3Service {
    
    public String uploadS3(){
        File file = new File("out.txt");
        boolean exists = file.exists();
        if(!exists){
            System.out.println("There is no File to upload!!!");
            return "There is no File to upload!!!";
        }
        S3Client s3 = S3Client.create();
        s3.putObject(PutObjectRequest.builder().bucket("jk.test").key("logs/test.txt").build(), RequestBody.fromFile(Paths.get("out.txt")));
        return "Success upload to S3!!!";
    }
}