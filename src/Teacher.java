public class Teacher {
    int id;
    String name;
    String sex;
    Course course;
    Course[] c = new Course[5];
    int i;

    Teacher(){};
    Teacher(int id,String name){
        this.id = id;
        this.name = name;
    }

    void add_course(Course cc){
        course = cc;
        course.teacher = this.name;
        c[i] = course;
        i++;
    }

    void show(){
        System.out.println(this.name+"的课表");
        int k = 1;
        for(int i=0;i<=this.i;i++) {
            if (c[i] == null) {
                continue;
            }
            else {
                System.out.print("课程"+ k);
                System.out.print(" 课程编号："+c[i].id);
                System.out.print(" 上课时间："+c[i].name);
                System.out.print(" 上课地点："+c[i].place);
                System.out.print(" 课程人数："+c[i].stu_num);
                System.out.println(" 上课时间：周"+c[i].week +" "+ c[i].time);
                k++;
            }
        }
    }
}
