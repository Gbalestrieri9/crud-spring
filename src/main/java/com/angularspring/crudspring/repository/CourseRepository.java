package com.angularspring.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angularspring.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long > {

}
