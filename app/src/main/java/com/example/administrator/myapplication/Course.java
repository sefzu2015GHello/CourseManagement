package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2015/9/28.
 *   课程信息类
 */
public class Course {

    private int grade;//年级
    private String major;//专业
    private int sum;//人数
    private String courseName;//课程名
    private String type;//选修类型
    private float credit;//学分
    private int classHour;//学时
    private int experimentHour;//实验学时
    private int computerHour;//上机学时
    private String fromToEnd;//起讫周序
    private String teacher;//教师
    private String note;//备注

    public Course() {//默认构造函数
        super();
    }

    public Course(int grade, String major, int sum,  //构造函数
                        String courseName, String type, float credit, int classHour,
                        int experimentHour, int computerHour, String fromToEnd,
                        String teacher, String note) {
        super();
        this.grade = grade;
        this.major = major;
        this.sum = sum;
        this.courseName = courseName;
        this.type = type;
        this.credit = credit;
        this.classHour = classHour;
        this.experimentHour = experimentHour;
        this.computerHour = computerHour;
        this.fromToEnd = fromToEnd;
        this.teacher = teacher;
        this.note = note;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getCredit() {
        return credit;
    }
    public void setCredit(float credit) {
        this.credit = credit;
    }
    public int getClassHour() {
        return classHour;
    }
    public void setClassHour(int classHour) {
        this.classHour = classHour;
    }
    public int getExperimentHour() {
        return experimentHour;
    }
    public void setExperimentHour(int experimentHour) {
        this.experimentHour = experimentHour;
    }
    public int getComputerHour() {
        return computerHour;
    }
    public void setComputerHour(int computerHour) {
        this.computerHour = computerHour;
    }
    public String getFromToEnd() {
        return fromToEnd;
    }
    public void setFromToEnd(String fromToEnd) {
        this.fromToEnd = fromToEnd;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
