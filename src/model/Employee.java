package model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String id;
    private String name;
    private int age;
    private String city;

    private String gender;
    private String active;
    private String department;
    private int yearOfJoining;
    private double salary;


}
