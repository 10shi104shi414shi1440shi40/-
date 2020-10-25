# -
# 计191杨涛实验三
# 一、实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法(属性、方法)；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString()方法,应用在相关对象的信息输出中。
# 二、题目要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。 对象示例： 人员（编号：、姓名：、性别：：）
对象实例：
Teacher m = new Teacher(1, "A", "女", "唱");
Teacher h = new Teacher(11, "B", "女", "跳");
Teacher d = new Teacher(111, "C", "女", "篮球");
Teacher n = new Teacher(1111, "D", "女", "rap");
Kecheng q = new Kecheng("1", "语文", "教100", "14:20");
Kecheng w = new Kecheng("2", "数学", "教101", "9:40");
Kecheng e = new Kecheng("3", "英语", "教102", "7:50");
Kecheng r = new Kecheng("4", "物理", "教103", "1:30");
# 三、实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
# 四、程序过程
1.创建父类人员以及其子类老师类和学生类。学生类和老师类继承父类人员类的属性。
2.创建课程类以储存课程信息同时与教师类关联，课程信息对应老师信息。
3.创建test类
# 五、核心代码
···
public String toString(){
        return "课程号："+ID+",课程名称:"+course_title+",上课地点:"+place_class+",教学时间:"+schooltime+",授课教师信息为:"+teacher_course_taught;
    }
···
 利用toString方法实现输出。
 
···
     String ID;
    String course_title;
    String place_class;
    String schooltime;
    Teacher teacher_course_taught;
···
课程类中同时定义教师类以串联二者关系。
# 六、流程图

# 七、实验结果
![result]()
