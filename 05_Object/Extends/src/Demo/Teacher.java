package Demo;

public class Teacher extends People{
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher(String name,int age,String sex,String course){
        super(name,age,sex);
        this.course = course;
    }
}
