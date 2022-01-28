package spring.di;

import spring.di.entity.*;
import spring.di.ui.*;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		console.print();
		
	}

}
