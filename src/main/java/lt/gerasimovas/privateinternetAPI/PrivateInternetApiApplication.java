package lt.gerasimovas.privateinternetAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrivateInternetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivateInternetApiApplication.class, args);
		System.out.println("Private internet API start");
	}

}
