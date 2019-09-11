package org.respec.respecapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "companies")
public class Companies {
    @Id
    @GeneratedValue
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "location_idx")
    private Locations location;

    @Column(length = 50, nullable = false)
    private String name;

    @Builder
    public Companies(String name){
        this.name = name;
    }
}
