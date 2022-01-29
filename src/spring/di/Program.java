package spring.di;

import org.springframework.context.*;
import org.springframework.context.support.*;

import spring.di.ui.*;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
