package com.toz.law;

import com.alibaba.fastjson.JSON;
import com.toz.law.domain.*;
import com.toz.law.mapper.FactMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

@SpringBootTest
class LawApplicationTests {
    @Autowired
    FactMapper factMapper;

    @Test
    void contextLoads() {
        try {
            FileReader fileReader=new FileReader("D:\\MyProject\\pythonProject\\final_all_data\\exercise_contest\\data_test.json");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=bufferedReader.readLine();
            while(line!=null){
                if(line.length()>7500){
                    line=bufferedReader.readLine();
                    continue;
                }
                Fact fact= JSON.parseObject(line,Fact.class);
                Meta meta=fact.getMeta();
                TermOfImprisonment termOfImprisonment=meta.getTermOfImprisonment();
                FactPO factPO=new FactPO();
                factPO.setFact(fact.getFact()).setPunishOfMoney(meta.getPunish_of_money()).setRelevantIds(meta.getRelevant_articles())
                        .setCriminals(meta.getCriminals()).setDeathPenalty(termOfImprisonment.getDeathPenalty())
                        .setImprisonment(termOfImprisonment.getImprisonment())
                        .setLifeImprisonment(termOfImprisonment.getLifeImprisonment());
                factMapper.addFact(factPO);


                String ids=meta.getRelevant_articles();
                List<Integer> idIntegers=JSON.parseArray(ids,Integer.class);
                List<String> accurationList=JSON.parseArray(meta.getAccusation(),String.class);
                for (int i=0;i<idIntegers.size()&&i<accurationList.size();i++){
                    Integer exist=factMapper.findAccurationById(idIntegers.get(i));
                    if(exist==null){
                        Accuration accuration=new Accuration(idIntegers.get(i),accurationList.get(i));
                        factMapper.addAccuration(accuration);
                    }
                }
                line=bufferedReader.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
