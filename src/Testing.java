import java.util.Arrays;
import java.util.Scanner;

public class Testing{
    public static void main(String[] args){
        Course[] C = new Course[20];
        Course c1 = new Course(1,"Java","教0921","20:00-21:30",4,40,"张老师");
        C[0] = c1;
        Course c2 = new Course(2,"Python","教303","20:00-21:30",3,40,"王老师");
        C[1] = c2;
        Course c3 = new Course(3,"C语音","教0908","20:00-21:30",2,40,"张老师");
        C[2] = c3;
        Course c4 = new Course(4,"离散数学","教201","20:00-21:30",1,40,"李老师");
        C[3] = c4;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------北石化选课系统--------------");
        System.out.println("请选择身份：，教师请输入1，学生请输入2"); //判断身份
        int iddd = in.nextInt();
        if (iddd == 1) {                               //教师操作界面
            //for (int i=0; ;i++){
            System.out.println("请输入ID：");
            int id = in.nextInt();
            System.out.println("请输入姓名：");
            String name = in.next();
            Teacher tea = new Teacher(id, name);
            int k = 0;
            for (int j = 0; j <= C.length; j++) {
                if (C[j] == null) {
                    break;
                }
                else {
                    if (tea.name.equals(C[j].teacher)) {
                        tea.add_course(C[j]);
                    }
                    else {
                        continue;
                    }
                }
            }
            tea.show();
        }

        if (iddd == 2) {                         //学生操作界面
            System.out.println("请输入ID：");
            int id = in.nextInt();
            System.out.println("请输入姓名：");
            String name = in.next();
            System.out.println("请输入性别：");
            String sex = in.next();
            System.out.println("请输入年龄：");
            int age = in.nextInt();
            Student stu = new Student(id,name,sex,age);
            System.out.println("可选课程");
            for (int i=0;i<=C.length;i++){   // 显示所有课程信息
                if(C[i] == null){
                    break;
                }
                else {
                    System.out.print(" 课程编号："+C[i].id);
                    System.out.print(" 授课教师："+C[i].teacher);
                    System.out.print(" 上课时间："+C[i].name);
                    System.out.print(" 上课地点："+C[i].place);
                    System.out.print(" 课程人数："+C[i].stu_num);
                    System.out.println(" 上课时间：周"+C[i].week +" "+ C[i].time);
                }
            }
            System.out.println("请输入课程编号选择课程");
            int class_id = in.nextInt();
            stu.add_course(class_id,C);
            System.out.println("您已成功选上该课程");


            for (int i=0; ;i++){
                System.out.println("请选择后续操作：（继续选课输入“1”，退课输入“2”，查看课表输入“3”,退出“4”）");
                int choose = in.nextInt();
                if (choose == 1){
                    System.out.println("请输入课程编号选择课程");
                    int class_idd = in.nextInt();
                    stu.add_course(class_idd,C);
                    System.out.println("您已成功选上该课程");
                }
                else if (choose == 2){
                    System.out.println("请输入课程编号退出课程");
                    int class_idd = in.nextInt();
                    stu.drop_course(class_idd);
                }
                else if (choose == 3) {
                    stu.show();
                }
                else if (choose == 4) {
                    break;
                }
            }
        }
    }
}
