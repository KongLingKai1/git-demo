package com.jk.service;

import com.jk.mapper.EmpMapper;
import com.jk.model.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl  implements  EmpService{

    @Resource
    private EmpMapper   empMapper;

    @Override
    public List<Emp> findEmp() {
        return empMapper.findEmp();
    }

    @Override
    public void deleteEmp(Integer id) {
        empMapper.deleteEmp(id);
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
    }

    @Override
    public Emp findById(Integer id) {
        return empMapper.findById(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }
}
