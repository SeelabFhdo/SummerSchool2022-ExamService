package de.fhdo.sep.exam.api;

import de.fhdo.sep.exam.domain.Exam;
import de.fhdo.sep.exam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ExamRestApi {
    private final ExamService examService;

    @Autowired
    public ExamRestApi(ExamService examService) {
        this.examService = examService;
    }

    @PostMapping("/exam")
    public Exam createExam(@RequestBody Exam exam) {
        return examService.createExam(exam);
    }

    @GetMapping("/exams")
    public List<Exam> readAllExams() {
        return examService.readAllExams();
    }
}
