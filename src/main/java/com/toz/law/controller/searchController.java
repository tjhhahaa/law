package com.toz.law.controller;

import javafx.beans.binding.ObjectExpression;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class searchController {

    @GetMapping("/")
    Object getByKeyWord(@Param("keyword")String keyword){

    }
}
