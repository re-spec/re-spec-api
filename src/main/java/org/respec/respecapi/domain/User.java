package org.respec.respecapi.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {
    @Id
    private int idx;

    private String nickname;

    private int age;

    private int career;

    private int salary;

    @Builder
    public User(String nickname, int age, int career, int salary) {
        this.nickname = nickname;
        this.age = age;
        this.career = career;
        this.salary = salary;
    }
}
