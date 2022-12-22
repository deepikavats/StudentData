import com.example.h2DatabaseExample.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Autowired
    StudentService studentService = new StudentService();

    @Test
    public void markstest(){
        String marks = "100";
       boolean flag =  studentService.studentmarks(marks);
       assertTrue(flag);
    }
}
