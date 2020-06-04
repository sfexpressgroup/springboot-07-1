package com.ht.dao;

import com.ht.bean.Emp;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
@Transactional
public interface EmpDao {
    List<Emp> alllist();

    List<Map> seldept();

    void addemp(Emp emp);

    Emp selbyid(int empno);

    void updemp(Emp emp);

    void delemp(int empno);
}
