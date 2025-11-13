package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@AllArgsConstructor
@Getter
@Setter
public class Exam {
    private int id;
    private String tittle;
    private Course course;
    private LocalDateTime examDate;
    private int coefficient;
}
