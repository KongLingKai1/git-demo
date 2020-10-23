package com.jk.mapper;

import com.jk.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    public List<Emp>  findEmp();

    public void  deleteEmp(Integer  id);

    public void  addEmp(Emp  emp);

    public Emp  findById(Integer  id);

    public void updateEmp(Emp  emp);

}
