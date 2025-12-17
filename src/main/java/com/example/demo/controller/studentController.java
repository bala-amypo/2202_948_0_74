package.com.example.demo.contrroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
@RestController
public class studentController{
    
    @GetMapping("/getAllstudent")
    public List<studentEntity>getAll(){

    }

}