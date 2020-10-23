package com.jk.service;

import com.jk.model.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider")
public interface EmpService {

    @RequestMapping("findEmp")
    public List<Emp> findEmp();

    @RequestMapping("deleteEmp")
    public void  deleteEmp(@RequestParam Integer id);

    @RequestMapping("addEmp")
    public void  addEmp(@RequestBody Emp  emp);

    @RequestMapping("findById")
    public  Emp  findById(@RequestParam Integer id);

    @RequestMapping("updateEmp")
    public void updateEmp(@RequestBody Emp  emp);
}
