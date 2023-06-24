package com.ahmad.practicethymeleaf.domain;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Serializable {

    private Integer id;
    private String name;
    private String gender;

}
