public class Renyuan {
    int ID;
    String name;
    String age;
    Renyuan(int ID,String name,String sex ) {
        setID(ID);
        setName(name);
        setSex(sex);
    }
    Renyuan(){

    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isSex() {
        return age;
    }

    public void setSex(String sex) {
        this.age = sex;
    }
}
