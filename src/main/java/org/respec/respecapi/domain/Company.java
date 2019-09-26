package org.respec.respecapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "location_idx")
    private Location location;

    @Column(length = 50, nullable = false)
    private String name;

    @Builder
    public Company(String name, Location location){
        this.name = name;
        this.location = location;
    }
}
