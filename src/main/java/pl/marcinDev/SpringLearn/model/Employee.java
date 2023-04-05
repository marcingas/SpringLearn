package pl.marcinDev.SpringLearn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok annotation for getter setter to string:
@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Long id;
    //    @JsonProperty("full_name")
    @Column(name = "name")
    private String name;
    //    @JsonIgnore
    @Column(name = "age")
    private Long age;
    @Column(name = "location")
    private String location;
    @Column(name = "email")
    private String email;
    @Column(name = "department")
    private String department;

}
