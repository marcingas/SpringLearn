package pl.marcinDev.SpringLearn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok annotation for getter setter to string:
@Setter
@Getter
@ToString
public class Employee {
//    @JsonProperty("full_name")
    private String name;
//    @JsonIgnore
    private Long age;
    private String location;
    private String email;
    private String department;

}
