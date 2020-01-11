package com.toz.law.service;

import com.toz.law.domain.Fact;
import org.springframework.stereotype.Service;

@Service
public interface searchService {

    Fact getByKeyWord(String keyWord);
}
