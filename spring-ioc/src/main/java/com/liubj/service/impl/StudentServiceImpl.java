package com.liubj.service.impl;

import com.liubj.dao.StudentDao;
import com.liubj.service.StudentService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentServiceImpl implements StudentService {

    //set 方式注入集合属性   List  Map  Set Properties

    private List<String> stringList;
    private List<StudentDao> studentDaoList;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setStudentDaoList(List<StudentDao> studentDaoList) {
        this.studentDaoList = studentDaoList;
    }

    private Map<String,StudentDao> studentDaoMap;
    private Set<StudentDao> studentDaoSet;
    private Properties properties;

    public void setStudentDaoMap(Map<String, StudentDao> studentDaoMap) {
        this.studentDaoMap = studentDaoMap;
    }

    public void setStudentDaoSet(Set<StudentDao> studentDaoSet) {
        this.studentDaoSet = studentDaoSet;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void printMessage(){
        System.out.println("stringList : " + stringList);
        System.out.println("studentDaoList : " + studentDaoList);
        System.out.println("studentDaoMap : " + studentDaoMap);
        System.out.println("studentDaoSet : " + studentDaoSet);
        System.out.println("properties : " + properties);
    }
}
