package com.ht.Controller;

import com.ht.bean.Emp;
import com.ht.service.IEmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Resource
    private IEmpService is;

    @RequestMapping("/list")
    public String list(Model model){
        List<Emp> list = is.listall();
        model.addAttribute("list",list);
        return "emp/emplist";
    }

    @RequestMapping("/toadd")
    public String toadd(Model model){
        List<Map> seldept = is.seldept();
        model.addAttribute("dept",seldept);
        return "emp/empadd";
    }

    @RequestMapping("/add")
    public String add(Emp emp){
        is.addemp(emp);
        return "redirect:list";
    }

    @RequestMapping("/toupd")
    public String toupd(int empno,Model model){
        List<Map> seldept = is.seldept();
        Emp emp = is.selbyid(empno);
        model.addAttribute("dept",seldept);
        model.addAttribute("emp",emp);
        return "emp/empupd";
    }

    @RequestMapping("/upd")
    public String upd(Emp emp){
        is.updemp(emp);
        return "redirect:list";
    }

    @RequestMapping("/del")
    public String del(int empno){
        is.delemp(empno);
        return "redirect:list";
    }

}
