package com.example.newspringboot.Controller;

import com.example.newspringboot.Service.MyService;
import com.example.newspringboot.model.AllEmploy;
import com.example.newspringboot.model.Employ;
import com.example.newspringboot.model.TotalEmploy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class MyController {

    @Autowired
    private MyService myService;

    @PostMapping("/post")
    public Employ addEmploy(@RequestBody Employ employ) {
        return myService.addEmploy(employ);
    }
    @GetMapping("/get1")
    public List<Employ> getAllEmploy() {
        return myService.getEmploy();
    }
    @GetMapping("/get2")
    public AllEmploy getAllEmployObj() {
        return myService.getEmployObjects();
    }
    @GetMapping("/get3")
    public TotalEmploy getTotalEmploy() {
        return myService.getTotalEmploy();
    }
    @PutMapping("/put")
    public Employ updateEmploy(@RequestBody Employ employ) {
        return myService.updateEmploy(employ);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmploy(@PathVariable("id") Integer id) {
        myService.deleteEmploy(id);
    }
}