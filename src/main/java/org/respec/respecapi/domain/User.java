package org.respec.respecapi.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

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

    @ManyToMany
    @JoinTable(name = "job_type_for_user",
               joinColumns = @JoinColumn(name = "user_idx"),
               inverseJoinColumns = @JoinColumn(name = "job_type_idx"))
    private List<JobType> jobType;

    @Builder
    public User(int idx, String nickname, int age, int career, int salary) {
        this.idx = idx;
        this.nickname = nickname;
        this.age = age;
        this.career = career;
        this.salary = salary;
    }
}
