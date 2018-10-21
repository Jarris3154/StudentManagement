package com.jia.studentmanagement.repository;

import com.jia.studentmanagement.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jarris on 10/21/2018.
 */

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, String> {

}
