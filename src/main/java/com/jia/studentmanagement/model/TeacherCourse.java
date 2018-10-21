package com.jia.studentmanagement.model;

import javax.persistence.*;

/**
 * Created by Jarris on 10/21/2018.
 */
@Entity(name = "teacher_course")
public class TeacherCourse {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    private String courseId;

    private String teacherId;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public String getTeacherId() {
        return teacherId;
    }
}
