package spring.di.ui;

import org.springframework.beans.factory.annotation.*;

import spring.di.entity.*;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	
	public InlineExamConsole() {

	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
