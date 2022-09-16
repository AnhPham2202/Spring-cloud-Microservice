package na.pham.student.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients("na.pham.student.student.FeignClients")
public class StudentApplication {

	@Value("${address.service.url}")
	private String addressServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
}
