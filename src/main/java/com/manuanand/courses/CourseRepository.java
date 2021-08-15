package com.manuanand.courses;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.courses.Course;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
