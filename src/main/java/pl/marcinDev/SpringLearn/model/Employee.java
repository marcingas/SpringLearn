package pl.marcinDev.SpringLearn.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok annotation for getter setter to string:
@Setter
@Getter
@ToString
public class Employee {
    private String name;
    private Long age;
    private String location;
    private String email;
    private String department;

}
