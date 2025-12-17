package.com.example.demo.contrroller;

import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.valid;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController{
    
    @Autowired
    @studentService service;
    
    @GetMapping("/getAllstudent")
    public List<studentEntity>getAll(){

    }

}