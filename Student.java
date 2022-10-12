package com.csdn.work;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L ;
    private String course;
    private String name; //姓名
    private String gender; //性别
    private int age; //年龄
    private String Gpa; //绩点
    private int[] attendance; //到勤情况
    private int probility; //缺勤概率

    /**
     * 获取
     * @return course
     */
    public String getCourse() {
        return course;
    }

    /**
     * 设置
     * @return course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * 获取
     * @return probility
     */
    public int getProbility() {
        return probility;
    }

    /**
     * 设置
     * @return probility
     */
    public void setProbility(int probility) {
        this.probility = probility;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * 获取
     * @return Gpa
     */
    public String getGpa() {
        return Gpa;
    }

    /**
     * 设置
     * @param Gpa
     */
    public void setGpa(String Gpa) {
        this.Gpa = Gpa;
    }

    /**
     * 获取
     * @return attendance
     */
    public int[] getAttendance() {
        return attendance;
    }

    /**
     * 设置
     * @param attendance
     */
    public void setAttendance(int[] attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", Gpa='" + Gpa + '\'' +
                ", attendance=" + Arrays.toString(attendance) +
                ", probility=" + probility +
                '}';
    }
}
