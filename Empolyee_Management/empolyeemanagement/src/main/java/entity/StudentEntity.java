package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="springbootcrud")

public class StudentEntity {
    private int id;
    private String name;
    private String email;
    private String department;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public StudentEntity(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }
    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
    }
    public StudentEntity() {
        
    }

    
}
