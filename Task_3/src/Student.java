import java.util.ArrayList;

public class Student extends Person
{
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList passedCourses)
    {
        super(name);
        this.passedCourses = passedCourses;
    }

    public Student(String name)
    {
        super(name);
    }

    @Override
    public boolean addCourse(String course)
    {
        for (String c: passedCourses )
        {
            if (course.equals(c))
            {
                return false;
            }
        }

        currentCourses.add(course);
        return true;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "currentCourses=" + currentCourses +
                ", name='" + name + '\'' +
                '}';
    }
}
