package Lab7;

import java.util.StringTokenizer;

public class Student {
    //attributes
    private String name;
    private String sid;
    private String s_level;
    private int age;
    //constructor

    public Student(String name, String sid, String s_level, int age) {
        this.name = name;
        this.sid = sid;
        this.s_level = s_level;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getS_level() {
        return s_level;
    }

    public void setS_level(String s_level) {
        this.s_level = s_level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                ", s_level='" + s_level + '\'' +
                ", age=" + age +
                '}';
    }
}
