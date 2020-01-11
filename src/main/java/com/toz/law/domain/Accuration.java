package com.toz.law.domain;

import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Alias("Accuration")
public class Accuration {
    private Integer id;
    private String accuration;
}
