package com.sath.microservicecoursemanagement.service;

import com.sath.microservicecoursemanagement.model.Course;
import com.sath.microservicecoursemanagement.model.Transaction;

import java.util.List;

public interface CourseService {

    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}
