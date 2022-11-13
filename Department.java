import java.util.Objects;

public class Department {

    private int id;
    private String name;
    private String employee;

    public Department(int id, String name, String employee) {
        this.id = id;
        this.name = name;
        this.employee = employee;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
    public String getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Department: ID = " + id + "; Name = " + name + "; Employee = " + employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Department department = (Department) o;

        if (getId() != department.getId()) {
            return false;
        }
        if (getEmployee() != department.getEmployee()) {
            return false;
        }
        if (getName() != department.getName()) {
            return false;
        }
        return false;
    }
}
