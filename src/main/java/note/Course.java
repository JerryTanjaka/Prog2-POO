package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
@Getter
@Setter
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
    private List<Exam> examsList = new ArrayList<>();
}
