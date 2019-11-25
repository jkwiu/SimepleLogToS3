package study.jk.logging;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/main")
    public String main() {
        return "hi";
    }

    @GetMapping("log")
    public void logging() throws IOException {
        LoggingService log = new LoggingService();
        log.logging();
    }

    @GetMapping("s3")
    public void upload(){
        S3Service s3 = new S3Service();
        s3.uploadS3();
    }
}