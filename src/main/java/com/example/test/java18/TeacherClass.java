package com.example.test.java18;

import lombok.Data;

/**
 * 老师与教学班级关联表
 * @author JinXing
 * @date 2019/8/7 11:16
 */

@Data
public class TeacherClass {

    /**主键ID*/
    private int id;

    /**教师ID*/
    private int teachId;

    /**班级ID*/
    private int classId;

    public TeacherClass(int id, int teachId, int classId) {
        this.id = id;
        this.teachId = teachId;
        this.classId = classId;
    }
}
