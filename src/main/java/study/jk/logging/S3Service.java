package study.jk.logging;

import java.nio.file.Paths;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3Service {
    
    public void uploadS3(){
        S3Client s3 = S3Client.create();
        s3.putObject(PutObjectRequest.builder().bucket("jk.test").key("logs/test.txt").build(), RequestBody.fromFile(Paths.get("out.txt")));
    }
}