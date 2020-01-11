package com.toz.law.domain;

import lombok.*;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
@Alias("FactPO")
public class FactPO implements Serializable {
    private Integer id;
    private String fact;
    private String relevantIds;
    private Double punishOfMoney;
    private String criminals;
    private Boolean deathPenalty;
    private Integer imprisonment;
    private Boolean lifeImprisonment;
}
