package com.example.test.java18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author JinXing
 * @date 2019/8/7 11:15
 */
public class DuplicateKey {


    public static void main(String[] args) {
        testV2();





    }

    private static void testV1() {

        //查询所有老师负责的班级(一个老师对应一个班级)
        List<TeacherClass> list = new ArrayList<>(20);
        int count = 10;
        for (int i = 0; i < count; i++) {
            list.add(new TeacherClass(i, 100 + i, 200 + i));
        }

        //结果返回每个老师对应的班级ID
        Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(TeacherClass::getTeachId, TeacherClass::getClassId));
        System.out.println("老师负责的班级ID:" + collect);
    }

    private static void testV2() {

        //查询所有老师负责的班级(一个老师对应一个班级)
        List<TeacherClass> list = new ArrayList<>(20);
        int count = 10;
        for (int i = 0; i < count; i++) {
            list.add(new TeacherClass(i, 100 + i, 200 + i));
        }

        //程序出了一个bug,导致有一个老师负责两个班级
        list.add(new TeacherClass(50, 100, 300));

        //结果返回每个老师对应的班级ID
        Collectors.toMap(TeacherClass::getTeachId, TeacherClass::getClassId);
        Collectors.toMap(TeacherClass::getTeachId, TeacherClass::getClassId, (aLong, aLong2) -> aLong2 >= aLong ? aLong2 : aLong);

        Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(TeacherClass::getTeachId, TeacherClass::getClassId
                , (aLong, aLong2) -> aLong2 >= aLong ? aLong2 : aLong));
        System.out.println("老师负责的班级ID:" + collect);
    }


}
