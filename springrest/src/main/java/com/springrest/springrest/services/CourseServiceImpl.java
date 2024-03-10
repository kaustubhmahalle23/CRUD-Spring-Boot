package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.findById(courseId).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course deleteCourse(long courseId) {
        Course courseToDelete = courseDao.findById(courseId).orElse(null);
        if (courseToDelete != null) {
            courseDao.delete(courseToDelete);
        }
        return courseToDelete;
    }

	@Override
	public Course getCourse(Course courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
