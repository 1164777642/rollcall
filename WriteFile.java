package com.csdn.work;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class WriteFile {

    public void writeData(String course) throws IOException {
        int x = 0, y = 0;
        double Ee = 0;
        RandGenerator rand = new RandGenerator();
        File file = new File(".\\" + course + ".txt"); // 建立文件
        ArrayList<Student> Students = new ArrayList<Student>();
        FileOutputStream f1 = null;
        ObjectOutputStream f2 = null;
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("文件创建成功");
        }
        try {
            f1 = new FileOutputStream(file);
            f2 = new ObjectOutputStream(f1);
            for (int i = 0; i < 90; i++) {

                Student student = new Student();
                String familyName = rand.getFamilyName();
                String[] nameAndGender = rand.getNameAndGender(rand.getGender());
                String gender = nameAndGender[1];
                String name = nameAndGender[0];
                int age = rand.getAge();
                String gpa = rand.getGpa();

                int[] attendence = new int[20];
                if (new Random().nextInt(10) + 1 < 6 && Double.parseDouble(gpa) < 2.0) {
                    for (int j = 0; j < 20; j++) {
                        if (new Random().nextInt(100) < 80)
                            attendence[j] = 0;
                        else attendence[j] = 1;
                    }
                } else {
                    for (int j = 0; j < 20; j++) {
                        if (new Random().nextInt(100) > 95)
                            attendence[j] = 0;
                        else attendence[j] = 1;
                    }
                }
                student.setAttendance(attendence);
                student.setCourse(course);
                student.setName(familyName + name);
                student.setGender(gender);
                student.setGpa(gpa);
                student.setAge(age);
                student.setProbility((int) (10 - Double.parseDouble(gpa)) * 3);
                Students.add(student);

            }
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 90; j++) {
                    if (new Random().nextInt(100) < Students.get(j).getProbility() - 12 * Double.parseDouble(Students.get(j).getGpa())) {
                        y++;
                        if (Students.get(j).getAttendance()[i] == 0) {
                            x++;
                            Students.get(j).setProbility(Students.get(j).getProbility() + 20);
                            if (Students.get(j).getProbility() > 100)
                                Students.get(j).setProbility(100);
                        } else {
                            Students.get(j).setProbility(Students.get(j).getProbility() - 10);
                            if (Students.get(j).getProbility() < 0)
                                Students.get(j).setProbility(0);
                        }
                    }
                }
            }
            System.out.println(x * 1.0 / y);
            f2.writeObject(Students);
        } catch (Exception e) {
        } finally {
            try {
                f2.close();
                f1.close();
            } catch (Exception e2) {
            }
        }
    }
}

