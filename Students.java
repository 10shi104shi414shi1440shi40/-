import java.util.Scanner;

public class Students extends Renyuan {
    private String selected_course;
    private static int idCounter=0;
    private Kecheng ccc;
    private String hobby;
    Students(int ID,String name,String sex,String hobby){
        super(ID,name,sex);
        this.ID = ++idCounter;
        setHobby(hobby);
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Kecheng getCcc() {
        return ccc;
    }

    public void setCcc(Kecheng ccc) {
        this.ccc = ccc;
    }

    public String getSelected_course() {
        return selected_course;
    }

    public void setSelected_course(String selected_course) {
        this.selected_course = selected_course;
    }


    public String toString(){
        return "["+"编号:"+ID+",姓名:"+name+","+"爱好:"+hobby+"]"+" 所选课程信息为："+ccc;
    }
}
