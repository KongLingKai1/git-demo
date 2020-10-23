package com.jk.service;

import com.jk.model.Emp;

import java.util.List;

public interface EmpService {

    public List<Emp> findEmp();

    public void  deleteEmp(Integer  id);

    public void  addEmp(Emp  emp);

    public Emp  findById(Integer  id);

    public void updateEmp(Emp  emp);
}
