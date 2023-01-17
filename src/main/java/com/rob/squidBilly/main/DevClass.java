package com.rob.squidBilly.main;

public class DevClass {
    private String name;
    private int id;
    public DevClass(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DevClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
