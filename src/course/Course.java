package course;

public class Course {

    private String name;
    private int numberOfClasses;

    public Course() {

    }

    public Course(String name, int numberOfClasses) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void info() {
        System.out.println("Course name: " + getName());
        System.out.println("Course, number of classes: " + getNumberOfClasses());
    }
}
