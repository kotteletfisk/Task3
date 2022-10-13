import java.util.ArrayList;

public class Main
{



    public static void main(String[] args)
    {
        ArrayList<String> logic = new ArrayList<>() {{
            add("Math");
            add("Physics");
            add("Chemistry");
            add("Computer Science");
        }};

        ArrayList<String> language = new ArrayList<>() {{
            add("English");
            add("Danish");
            add("C++");
            add("Volapük");
        }};

        ArrayList<String> art = new ArrayList<>() {{
            add("Music");
            add("Painting");
            add("Drama");
            add("Coding");
        }};

        Teacher teacher1 = new Teacher("Joe", logic);
        Teacher teacher2 = new Teacher("Mogens", art);
        Teacher teacher3 = new Teacher("Gert", language);

        Student student1 = new Student("Ib");
        Student student2 = new Student("Birgit", art);
        Student student3 = new Student("Lars", logic);

        ArrayList<Person> persons = new ArrayList<>()
        {{
            add(teacher1);
            add(teacher2);
            add(teacher3);
            add(student1);
            add(student2);
            add(student3);
        }};

        for (Person p: persons)
        {
            p.addCourse("Java 1.0");
        }

        System.out.println(persons.toString());


    }
}
