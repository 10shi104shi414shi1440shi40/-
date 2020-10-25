public class Teacher extends Renyuan {
    private String courses_taught;
    private String hobby;
    private Kecheng ct;
    Teacher(int ID,String name,String sex,String hobby){
        super(ID,name,sex);
        setCourses_taught(courses_taught);
        setHobby(hobby);
        setCt(ct);
    }
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Kecheng getCt() {
        return ct;
    }

    public void setCt(Kecheng ct) {
        this.ct = ct;
    }

    public String getCourses_taught() {
        return courses_taught;
    }

    public void setCourses_taught(String courses_taught) {
        this.courses_taught = courses_taught;
    }
    public String toString(){
        return "["+"编号:"+ID+",姓名:"+name+"，性别："+age+",爱好:"+hobby+"]";
    }
}

