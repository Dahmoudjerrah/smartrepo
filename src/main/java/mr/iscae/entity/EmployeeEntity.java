  package mr.iscae.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gender;
    private Date datenaissance;
    private String address;

    public EmployeeEntity() {

    }

    public EmployeeEntity(long id, String name, String gender, Date datenaissance, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.datenaissance = datenaissance;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
