package org.respec.respecapi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "locations")
public class Locations {
    @Id
    @GeneratedValue
    @Column(name = "idx")
    private Long idx;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Builder
    public Locations(String name){
        this.name = name;
    }
}
