package com.lucky.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.lucky.ssm.pojo.Emp;
import com.lucky.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.lucky.ssm.service.impl.EmpServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassPackage:com.lucky.ssm.controller
 * @ClassName:EmpController
 * @Author:LuckyCheng 23953
 * @Create:2023/4/16-15:52 星期日
 * @ClassDescription:
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getAllEmpControllerByPage(@PathVariable("pageNum")Integer pageNum, Model model){//分页插件的使用
        //获取员工的分页信息
        PageInfo<Emp> page = empService.getEmpByPage(pageNum);
        //将分页数据信息在请求域中共享
        model.addAttribute("page",page);
        //跳转到employee_list.html
        return "employee_list";
    }
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmpController(Model model){
        //查询所有员工信息
        List<Emp> list = empService.getAllEmp();
        //将查询结果在请求域中共享
        model.addAttribute("list",list);
        //跳转到employee_list.html
        return "employee_list";
    }
}

