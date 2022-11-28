package pt.uma.tspi.arqd;

public class Course {
    private int code;
    private String name;
    private int ects;
    private int ano;

    public Course(int code, String name, int ects, int ano) {
        this.code = code;
        this.name = name;
        this.ects = ects;
        this.ano = ano;
    }
    public int getCode() {
        return this.code;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        Course other = (Course) obj;
        return this.code == other.code && this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", ects=" + ects +
                ", ano=" + ano +
                '}';
    }

    public Integer getAno() {
        return this.ano;
    }
}
