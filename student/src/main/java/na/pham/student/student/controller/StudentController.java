package na.pham.student.student.controller;

import na.pham.student.student.request.CreateStudentRequest;
import na.pham.student.student.response.StudentResponse;
import na.pham.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public StudentResponse getStudent(@PathVariable Long id) {
        return new StudentService().getById(id);
    }

    @PostMapping("/")
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createAddressRequest) {
        return studentService.createStudent(createAddressRequest);
    }
}
