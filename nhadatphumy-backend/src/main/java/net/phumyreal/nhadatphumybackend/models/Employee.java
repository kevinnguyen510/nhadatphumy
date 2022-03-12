package net.phumyreal.nhadatphumybackend.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}