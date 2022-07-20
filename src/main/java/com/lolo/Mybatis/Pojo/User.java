package com.lolo.Mybatis.Pojo;

public class User {

    private Integer    id;
    private  String last_name;
    private String email;
    private double salary;

    public User() {
    }

    public User(Integer id, String name, String email, double salary) {
        this.id = id;
        this.last_name = name;
        this.email = email;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return last_name;
    }

    public void setName(String name) {
        this.last_name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
