package com.toz.law.mapper;

import com.toz.law.domain.Accuration;
import com.toz.law.domain.FactPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface FactMapper {
    public boolean addFact(FactPO factPO);

    public boolean addAccuration(Accuration accuration);

    public Integer findAccurationById(Integer id);
}
