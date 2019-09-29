package org.respec.respecapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="technologies")
@Getter
@NoArgsConstructor
public class Technology {
    @Id @GeneratedValue
    private Long idx;

    private String name;

    @OneToMany(mappedBy = "users")
    private List<TechnologyForUser> users = new ArrayList<>();


}
