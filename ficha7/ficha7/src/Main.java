import pt.uma.tspi.arqd.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //if_else();
        //Switch();
        Rational rr = new Rational(2,2);
        Rational rr1 = new Rational(2,2);
        Rational rr2 = new Rational(3,2);
        Rational rr3 = new Rational(7,2);
        Rational rr4 = new Rational(9,2);
        Rational rr5 = new Rational();

        List<Rational> rationalList = new ArrayList<Rational>();

        rationalList.add(rr);
        rationalList.add(rr1);
        rationalList.add(rr2);
        rationalList.add(rr3);
        rationalList.add(rr4);
        rationalList.add(rr5);

        //System.out.println(rationalList);

        Collections.sort(rationalList);

        //System.out.println(rationalList);

        List<Student> studentList= new ArrayList<Student>();

        Student s1 = new Student(3,"Carlos");
        Student s2 = new Student(2,"Manel");
        Student s3 = new Student(1,"Paulo");
        Student s4 = new Student(4,"Duarte");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Collections.sort(studentList);

        //System.out.println(studentList);

        //System.out.println("By name: ");
        Collections.sort(studentList, new StudentsComparatorByName());
        //System.out.println(studentList);

        //System.out.println("By number: ");
        Collections.sort(studentList, new StudentsComparatorByNumber());
        //System.out.println(studentList);

        Map<Integer,Course> courseMap = new HashMap<Integer,Course>();


        Course c1 = new Course(1,"Arq",20,2021);
        Course c2 = new Course(2,"cozinha",50,2022);
        Course c3 = new Course(3,"dança",13,2022);
        Course c4 = new Course(4,"Pintor",90,2020);

        courseMap.put(c1.getCode(),c1);
        courseMap.put(c2.getCode(),c2);
        courseMap.put(c3.getCode(), c3);
        courseMap.put(c4.getCode(),c4);

        //System.out.println(courseMap);

        for (Course course: courseMap.values()) {
            if (course.getName().equals("dança")){
                //System.out.println(course);
            }

        }

        for (Integer keys: courseMap.keySet()) {
            //System.out.println(keys);

        }

        for (Course disciplinas: courseMap.values()) {
            //System.out.println(disciplinas);
        }

        for (Map.Entry<Integer, Course> entry: courseMap.entrySet()) {
            //System.out.println(entry);

        }

        SortedSet<Integer>anos = new TreeSet<>();
        for (Integer key:courseMap.keySet()) {
            anos.add(courseMap.get(key).getAno());
        }

        ArrayList<ArrayList<Course>> coursesByYear= new ArrayList<ArrayList<Course>>();
        for (int ano:anos) {
            ArrayList<Course>list= new ArrayList<Course>();
            for (Course course: courseMap.values()) {
                if(ano==course.getAno()){
                    list.add(course);
                }
            }
            coursesByYear.add(list);
        }

        for (ArrayList<Course>list:coursesByYear) {
            for (Course course:list) {
                System.out.println(course);
            }
        }


    }

    public static void if_else() {
        for (Menu menu : Menu.values()) {
            System.out.println(menu);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        String line = scanner.nextLine();
        Menu command = Menu.valueOf(line);
        if (command == Menu.START) {
            System.out.println("STARTING");
        } else if (command == Menu.SAVEGAME) {
            System.out.println("SAVING NAME");
        } else if (command == Menu.LOADGAME) {
            System.out.println("LOADING GAME");
        } else if (command == Menu.HIGHSCORES) {
            System.out.println("HIGHSORES");
        } else if (command == Menu.QUIT) {
            System.out.println("QUIT");
        }
    }

    public static void Switch() {
        for (Menu menu : Menu.values()) {
            System.out.println(menu);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        String line = scanner.nextLine();
        Menu command = Menu.valueOf(line);
        switch (command) {
            case START:
                System.out.println("STARTING");
                break
                        ;
            case SAVEGAME:
                System.out.println("SAVING GAMEE");
                break
                        ;
            case LOADGAME:
                System.out.println("LOADING");
                break
                        ;
            case HIGHSCORES:
                System.out.println("HIGHSCORES");
                break
                        ;
            case QUIT:
                System.out.println("QUIT");
                break
                        ;
            default:
                System.out.println("Opção não encontrada");
                break
                        ;
        }

    }
}