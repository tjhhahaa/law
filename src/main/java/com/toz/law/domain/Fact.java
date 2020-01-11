package com.toz.law.domain;

import lombok.*;
import com.alibaba.fastjson.*;

import java.io.BufferedReader;
import java.io.FileReader;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Fact {
    private Integer id;
    private String fact;
    private Meta meta;

public static void main(String[] args){
    try {
        FileReader fileReader=new FileReader("D:\\MyProject\\pythonProject\\final_all_data\\exercise_contest\\data_test.json");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        Fact fact=JSON.parseObject(line,Fact.class);
        System.out.println(fact.toString());
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
