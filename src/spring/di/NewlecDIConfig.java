package spring.di;

import org.springframework.context.annotation.*;

import spring.di.entity.*;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
