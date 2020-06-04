package com.ht.service.impl;

import com.ht.dao.EmpDao;
import com.ht.bean.Emp;
import com.ht.service.IEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class IEmpServiceimpl implements IEmpService {

    @Resource
    private EmpDao dao;

    @Override
    public List<Emp> listall() {
        return dao.alllist();
    }

    @Override
    public List<Map> seldept() {
        return dao.seldept();
    }

    @Override
    public void addemp(Emp emp) {
        dao.addemp(emp);
    }

    @Override
    public Emp selbyid(int empno) {
        return dao.selbyid(empno);
    }

    @Override
    public void updemp(Emp emp) {
        dao.updemp(emp);
    }

    @Override
    public void delemp(int empno) {
        dao.delemp(empno);
    }
}
