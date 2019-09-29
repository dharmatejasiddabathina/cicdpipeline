package com.example.jenkins.cicd.pipeline;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CiCdPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdPipelineApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello tejaa";
	}

}

