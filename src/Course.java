public class Course {
    int id;
    String name;
    String place;
    String time;
    String teacher;
    int week;  //星期几
    int stu_num; //学生数量

    Course(int id,String name,String place,String time,int week,int stu_num,String teacher){
        this.id = id;
        this.name = name;
        this.place = place;
        this.time = time;
        this.week = week;
        this.stu_num = stu_num;
        this.teacher = teacher;
    }
}
