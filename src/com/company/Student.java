package com.company;
import java.util.*;

public class Student implements Iterable{

    private String name;
    private String[] skills;

    public Student(String name, String[] skills) {
        this.name = name;
        this.skills=skills;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator iterator(){
        return new Iterator() {
            int index=0;
            @Override
            public boolean hasNext() {
                if(index< skills.length) return true;
                return false;
            }

            @Override
            public Object next() {
                return skills[index++];
            }

            @Override
            public void remove() {

            }
        };
    }

}
