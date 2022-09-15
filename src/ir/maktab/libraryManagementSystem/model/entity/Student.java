package ir.maktab.libraryManagementSystem.model.entity;

import java.util.Objects;

public class Student extends User {
    private String Classes;

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(Classes, student.Classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Classes);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Classes='" + Classes + '\'' +
                '}';
    }
}
