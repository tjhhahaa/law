package com.toz.law.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class TermOfImprisonment {
    private Integer id;
    private Boolean deathPenalty;
    private Integer imprisonment;
    private Boolean lifeImprisonment;
}
