package com.jk.controller;

import com.jk.model.Emp;
import com.jk.service.EmpService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {

    @Resource
    private EmpService  empService;

    @RequestMapping("findEmp")
    @HystrixCommand(fallbackMethod = "findEmpFall")
    public String   findEmp(Model  model){
        List<Emp>  empList = empService.findEmp();
        model.addAttribute("empList",empList);
        return "list";
    }
    public  String  findEmpFall(Model model){
        return "系统错误！！！请联系管理员！！！";
    }

    @RequestMapping("deleteEmp")
    @HystrixCommand(fallbackMethod = "deleteEmpFall")
    public String   deleteEmp(Integer  id){
        empService.deleteEmp(id);
        return "redirect:findEmp";
    }
    public  String  deleteEmpFall(Integer  id){
        return "系统错误！！！请联系管理员！！！";
    }

    @RequestMapping("toAdd")
    @HystrixCommand(fallbackMethod = "toAddFall")
    public String   toAdd(Model  model){
        model.addAttribute("emp",new Emp());
        return "add";
    }
    public  String  toAddFall(Model  model){
        return "系统错误！！！请联系管理员！！！";
    }

    @RequestMapping("addEmp")
    @HystrixCommand(fallbackMethod = "addEmpFall")
    public String   addEmp(Emp  emp){
        if (emp.getEmpId() == null){
            empService.addEmp(emp);
            return "redirect:findEmp";
        }
            empService.updateEmp(emp);
            return "redirect:findEmp";
    }
    public  String  addEmpFall(Emp  emp){
        return "系统错误！！！请联系管理员！！！";
    }

    @RequestMapping("findById")
    @HystrixCommand(fallbackMethod = "findByIdFall")
    public String   findById(Integer  id,Model model){
        Emp  emp = empService.findById(id);
        model.addAttribute("emp",emp);
        return "add";
    }
    public  String  findByIdFall(Integer  id,Model model){
        return "系统错误！！！请联系管理员！！！";
    }
}
