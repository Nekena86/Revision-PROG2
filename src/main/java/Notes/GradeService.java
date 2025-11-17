package Notes;

import java.time.Instant;
import java.util.List;

public class GradeService {
    private List<Grade> grades;

    public GradeService(List<Grade> grades) {
        this.grades = grades;
    }

    public double getExamGrade(Exam exam, Student student) {
        return grades.stream()
                .filter(g -> g.getExam().equals(exam) && g.getStudent().equals(student))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getValue();
    }

    public double getCourseGrade(Course course, Student student, Instant t ){
        return grades.stream()
                .filter()
    }
}
