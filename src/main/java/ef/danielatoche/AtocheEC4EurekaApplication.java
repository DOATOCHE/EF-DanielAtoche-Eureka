package ef.danielatoche;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AtocheEC4EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtocheEC4EurekaApplication.class, args);
	}
}
