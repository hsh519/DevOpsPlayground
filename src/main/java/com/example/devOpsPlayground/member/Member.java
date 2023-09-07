package com.example.devOpsPlayground.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int age;
}
