package com.baidu.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-10-05 22:05
 */
@Component
public class Dog {
    private String name;

    private String age;


    public Dog() {

    }

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "Dog{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

