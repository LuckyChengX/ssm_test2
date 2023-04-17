package com.lucky.ssm.mappers;

/**
 * @ClassPackage:com.lucky.ssm.mappers
 * @ClassName:empMapper
 * @Author:LuckyCheng 23953
 * @Create:2023/4/16-15:27 星期日
 * @ClassDescription:
 */

import com.lucky.ssm.pojo.Emp;

import java.util.List;

/**
 * mybatis的配置文件中设置了扫描这个包
 */
public interface empMapper {
    List<Emp> getAllEmp();
}
