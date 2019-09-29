package org.respec.respecapi.infrastructure;

import org.respec.respecapi.domain.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
