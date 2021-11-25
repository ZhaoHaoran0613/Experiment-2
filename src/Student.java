public class Student {
    int id;
    String name;
    String sex;
    int age;
    Course course;
    Course[] c = new Course[5];
    int i;

    Student(int id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void add_course(int class_id, Course[] C) {
        for (int a = 0; a <= C.length; a++) {
            if (C[a] == null) {
                break;
            } else {
                if (class_id == C[a].id) {
                    addcourse(C[a]);
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    void addcourse(Course cc) {
        course = cc;
        c[i] = course;
        i++;
    }

    void drop_course(int id) {
        Course[] d = new Course[5];
        int j = 0;
        for (int i = 0; i <= this.i; i++) {
            if (c[i] == null) {
                continue;
            } else {

                if (id == c[i].id) {
                    continue;
                } else {
                    d[j] = c[i];
                    j++;
                }

            }
            c = d;
            System.out.println("您已成功退出该课程");
        }
    }
        void show(){
            System.out.println("学生课表");
            for (int i = 0; i <= this.i; i++) {
                if (c[i] == null) {
                    continue;
                } else {
                    System.out.print(" 课程编号：" + c[i].id);
                    System.out.print(" 授课教师：" + c[i].teacher);
                    System.out.print(" 上课时间：" + c[i].name);
                    System.out.print(" 上课地点：" + c[i].place);
                    System.out.print(" 课程人数：" + c[i].stu_num);
                    System.out.println(" 上课时间：周" + c[i].week + " " + c[i].time);
                }
            }
        }

}
