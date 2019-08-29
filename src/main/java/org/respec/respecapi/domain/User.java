package org.respec.respecapi.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private int idx;

    private String nickname;

    private int age;

    private int career;

    private int salary;

    @Builder
    public User(int idx, String nickname, int age, int career, int salary) {
        this.idx = idx;
        this.nickname = nickname;
        this.age = age;
        this.career = career;
        this.salary = salary;
    }
}
