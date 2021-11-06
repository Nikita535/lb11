package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] skills =new String[] {"Java","JS","C++","C#","JS","React"};

        Student student=new Student("Nikita Zhiznevskiy",skills);

        Iterator iterator=student.iterator();
        System.out.println("Student: "+student.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
        }

    }
}
