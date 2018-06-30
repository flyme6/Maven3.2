package com.flyme.service;

import com.flyme.po.Course;

public interface CourseService {
    //根据id更新课程信息
    Course findById(Integer id) throws Exception;
}
