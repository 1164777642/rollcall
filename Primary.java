package com.csdn.work;

import com.csdn.work.ReadFile;
import com.csdn.work.Student;
import com.csdn.work.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Primary {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int x=0,y=0;
        WriteFile f1 = new WriteFile();
        System.out.println("请输入要点名的课程：");
        Scanner input=new Scanner(System.in);
        String course = input.next();
        f1.writeData(course);
        //int RandNum = new Random().nextInt(5,9);
        ReadFile f2 = new ReadFile();
        ArrayList<Student> One = new ArrayList<Student>();
        One = f2.getData(course);
        //System.out.println(1.0*x/y);
    }
}
