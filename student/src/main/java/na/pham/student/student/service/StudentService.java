package na.pham.student.student.service;

import na.pham.student.student.entity.Student;
import na.pham.student.student.repository.StudentRepository;
import na.pham.student.student.request.CreateStudentRequest;
import na.pham.student.student.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
        Student student = new Student();
        student.setFirstName(createStudentRequest.getFirstName());
        student.setLastName(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());
        student.setAddressId(createStudentRequest.getAddressId());

        studentRepository.save(student);
        return new StudentResponse(student);
    }

    public StudentResponse getById(Long id) {
        Student student = studentRepository.findById(id).get();
        return new StudentResponse(student);
    }
}
