package com.lucky.ssm.service;

import com.github.pagehelper.PageInfo;
import com.lucky.ssm.pojo.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassPackage:service
 * @ClassName:EmpService
 * @Author:LuckyCheng 23953
 * @Create:2023/4/16-16:15 星期日
 * @ClassDescription:
 */
@Service
public interface EmpService {
    List<Emp> getAllEmp();
    /**
     * 员工分页信息
     */
    PageInfo<Emp> getEmpByPage(Integer pageNum);
}
