package com.lucky.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lucky.ssm.mappers.empMapper;
import com.lucky.ssm.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucky.ssm.service.EmpService;

import java.util.List;

/**
 * @ClassPackage:service.impl
 * @ClassName:EmpServiceImpl
 * @Author:LuckyCheng 23953
 * @Create:2023/4/16-16:16 星期日
 * @ClassDescription:
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired//自动装配
    private empMapper empMapper;

    /**
     * 查询所有员工信息
     */
    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();//调用empMapper接口中的方法
    }


    @Override
    public PageInfo<Emp> getEmpByPage(Integer pageNum) {
        //开启分页共功能
        PageHelper.startPage(pageNum,3);//第一个参数是当前页数，第二个参数是每页展示的数量，
        //查询所有员工
        List<Emp> list = empMapper.getAllEmp();
        //获取分页相关数据
        PageInfo<Emp> page = new PageInfo<>(list, 5);//第一个参数是查询的结果集，第二个参数是导航标签的个数。
        return page;
    }

}

