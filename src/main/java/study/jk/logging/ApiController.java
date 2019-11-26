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
    public String logging() throws IOException {
        LoggingService log = new LoggingService();
        log.logging();
        return "Log generated!!!!";
    }

    @GetMapping("s3")
    public String upload(){
        S3Service s3 = new S3Service();
        String str =s3.uploadS3();
        return str;
    }
}