package br.cnj.segundo_projeto;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class SegundoProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProjetoApplication.class, args);
	}

}
