import java.util.HashSet;
import java.util.Scanner;

public class text {
    public static void main(String args[]) {
        HashSet<Students> names = new HashSet<Students>();//创建HashMap集合对象

        Scanner in = new Scanner(System.in);

        Teacher m = new Teacher(1, "A", "女", "跳舞");
        Teacher h = new Teacher(11, "B", "女", "唱歌");
        Teacher d = new Teacher(111, "C", "女", "游泳");
        Teacher n = new Teacher(1111, "D", "女", "健身");

        Kecheng q = new Kecheng("1", "语文", "教100", "14:20");
        q.setTeacher_course_taught(m);
        Kecheng w = new Kecheng("2", "数学", "教101", "9:40");
        w.setTeacher_course_taught(h);
        Kecheng e = new Kecheng("3", "英语", "教102", "7:50");
        e.setTeacher_course_taught(d);
        Kecheng r = new Kecheng("4", "物理", "教103", "1:30");
        r.setTeacher_course_taught(n);

        Students s = new Students(120, "E", "女", "做饭");
        Students t = new Students(190, "F", "男", "打球");
        Students b = new Students(190, "G", "男", "打球");
        System.out.println("课程信息：");
        System.out.println("1号课程：" + q);
        System.out.println("2号课程：" + w);
        System.out.println("3号课程：" + e);
        System.out.println("4号课程：" + r);
        System.out.println("请输入所选课程编号:");
        Students[] s1 = {s, t, b};
        for (Students str : s1) {
            int i = in.nextInt();
            System.out.println("请下一个同学选课");
            switch (i) {
                case 1:
                    str.setCcc(q);
                    System.out.println("你选的是第一个的课程");
                    System.out.println("您的信息为");
                    System.out.println(str);
                    names.add(str);
                    break;
                case 2:
                    str.setCcc(w);
                    System.out.println("你选的是第二个的课程");
                    System.out.println("您的信息为");
                    System.out.println(str);
                    names.add(str);
                    break;
                case 3:
                    System.out.println("你选的是第三个的课程");
                    System.out.println("您的信息为");
                    str.setCcc(e);
                    System.out.println(str);
                    names.add(str);
                    // 另一种打印
                    //System.out.println("88"+names+"11111");
                    break;
                case 4:
                    System.out.println("你选的是第四个课程的课程");
                    System.out.println("您的信息为");
                    str.setCcc(r);
                    System.out.println(str);
                    names.add(str);
                    break;
                default:
                    System.out.println("选课无效!");
                    return;
            }
        }

        System.out.println("打印课程列表");
        for (Object object : names) {
            System.out.println(object);
        }
        System.out.println("\n----------------------");

        System.out.println("退课开始！！！");
        System.out.println("是否退课：（是：1 否：2）");
        Students[] s2 = {s, t, b};
        for (Students str : s1) {
            int x = in.nextInt();
            if (x == 1) {
                str.setCcc(null);
                names.remove(str);
                System.out.println("退课成功！");
                System.out.println(str);
                //sti[]=null;
            } else {
                System.out.println("退课结束!");
            }
        }
        System.out.println("打印课程列表2");
        for (Object object : names) {
            System.out.println(object);
        }
        System.out.println("\n----------------------");
    }
}