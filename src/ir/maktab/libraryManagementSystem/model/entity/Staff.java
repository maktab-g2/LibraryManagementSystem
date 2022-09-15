package ir.maktab.libraryManagementSystem.model.entity;

import java.util.Objects;

public class Staff extends User{
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Objects.equals(dept, staff.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dept);
    }

    @Override
    public String toString() {
        return "staff{" +
                "dept='" + dept + '\'' +
                '}';
    }
}
