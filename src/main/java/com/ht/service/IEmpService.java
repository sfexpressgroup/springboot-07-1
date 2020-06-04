package com.ht.service;

import com.ht.bean.Emp;

import java.util.List;
import java.util.Map;

public interface IEmpService {
    List<Emp> listall();
    List<Map> seldept();
    void addemp(Emp emp);
    Emp selbyid(int empno);
    void updemp(Emp emp);
    void delemp(int empno);
}
