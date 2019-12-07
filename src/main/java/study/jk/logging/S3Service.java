package study.jk.logging;

import java.io.File;
import java.nio.file.Paths;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;


public class S3Service {

    private void uploadS3(String fileName) {
        final S3Client s3 = S3Client.create();
        s3.putObject(PutObjectRequest.builder().bucket("jk.test").key("logs/"+ fileName).build(), RequestBody.fromFile(Paths.get(fileName)));
    }

    public void upload(String fileName){


        if (fileName != null){
            // After upload, delete temp log file
            final File file = new File(fileName);
                uploadS3(fileName);
                file.delete();
                System.out.println("Uploaded Log File to S3 bucket");
        } else {
            System.out.println("No File to upload");
        }
    }
}