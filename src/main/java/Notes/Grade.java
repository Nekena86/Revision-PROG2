package Notes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Exam exam;
    private Student student;
    private double initialValue;
    private List<GradeChange> changes = new ArrayList<>();

    public Grade(Exam exam, Student student, double initialValue) {
        this.exam = exam;
        this.student = student;
        this.initialValue = initialValue;
    }

    public void addChange (double value, Instant timestamp, String reason){
        changes.add(new GradeChange(value, timestamp, reason));
    }

    public double getValue() {return initialValue;}
    public Exam getExam() {return exam;}
    public Student getStudent() {return student;}
}

