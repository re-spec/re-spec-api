package org.respec.respecapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * JobType
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name= "job_types")
public class JobType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    private String name;
}