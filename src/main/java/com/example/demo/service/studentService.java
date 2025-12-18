package come.example.demo.service;

import com.example.demo.entity.*;
import java.util.*;

interface studentService{

    List<studentEntity> getAll();

    studentEntity addstudent(studentEntity student);
    
}
