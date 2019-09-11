package org.respec.respecapi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "company_for_user")
public class CompanyForUser {
    @Id
    @GeneratedValue
    private Long idx;

    @OneToOne
    @JoinColumn(name = "user_idx")
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_idx")
    private Companies company;

    //private Location location; // 이게 필요한가? companies에 이미 있는 필드

    @Temporal(TemporalType.TIMESTAMP)
    private Date in_date;

    @Temporal(TemporalType.TIMESTAMP)
    private Date out_date;

    private int last_salary;
    private boolean is_working;
}
