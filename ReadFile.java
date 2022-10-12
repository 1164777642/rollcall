package com.csdn.work;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFile {
    public ArrayList<Student> getData(String course) throws IOException {
        FileInputStream f1 = null;
        ObjectInputStream f2 = null;
        ArrayList<Student> Students = new ArrayList<Student>();
        try {
            f1 = new FileInputStream(course+".txt");
            f2 = new ObjectInputStream(f1);
            Students = (ArrayList<Student>) f2.readObject();
            for (Student oneUser : Students) {
                System.out.println(oneUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                f2.close();
                f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Students;
    }
}
