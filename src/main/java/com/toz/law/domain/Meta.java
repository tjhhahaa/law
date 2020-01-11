package com.toz.law.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Meta {
    private Integer id;
    private String relevant_articles;
    private String accusation;
    private Double punish_of_money;
    private String criminals;
    private  TermOfImprisonment termOfImprisonment;
}
