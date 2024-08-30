package com.aj.course_enrollment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aj.course_enrollment_service.entity.Enrollment;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
//    List<Enrollment> findByCourse_id(Integer course_id);
}
