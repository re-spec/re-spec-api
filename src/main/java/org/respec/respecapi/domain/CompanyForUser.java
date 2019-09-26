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
    private Company company;

    @Temporal(TemporalType.TIMESTAMP)
    private Date in_date;

    @Temporal(TemporalType.TIMESTAMP)
    private Date out_date;

    private int last_salary;
    private boolean is_working;
}
