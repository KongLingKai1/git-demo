package com.jk.controller;

import com.jk.model.Emp;
import com.jk.service.EmpService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    @Resource
    private EmpService  empService;

    @RequestMapping("findEmp")
    public List<Emp>   findEmp(){
        return empService.findEmp();
    }

    @RequestMapping("deleteEmp")
    public void  deleteEmp(@RequestParam Integer id){
        empService.deleteEmp(id);
    }

    @RequestMapping("addEmp")
    public void  addEmp(@RequestBody Emp  emp){
        empService.addEmp(emp);
    }

    @RequestMapping("findById")
    public  Emp  findById(@RequestParam Integer id){
        return empService.findById(id);
    }

    @RequestMapping("updateEmp")
    public void updateEmp(@RequestBody Emp  emp){
        empService.updateEmp(emp);
    }
}
