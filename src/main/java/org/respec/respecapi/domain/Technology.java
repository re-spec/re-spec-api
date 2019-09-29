package org.respec.respecapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Technology {
    @Id @GeneratedValue
    private Long idx;

    private String name;

    @OneToMany(mappedBy = "users")
    private List<TechnologyForUser> users = new ArrayList<>();


}
