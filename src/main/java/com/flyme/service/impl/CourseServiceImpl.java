package com.flyme.service.impl;

import com.flyme.mapper.CourseMapper;
import com.flyme.po.Course;
import com.flyme.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    public Course findById(Integer id) throws Exception {
        Course course = courseMapper.selectByPrimaryKey(id);
        return course;
    }
}
