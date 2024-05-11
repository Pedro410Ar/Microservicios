package air.plane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PlaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaneApplication.class, args);

		System.out.println("Probando marcas de aviones");

	}

}
