package com.tongjiaqianTransaction.service;

import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    @Transactional
    void exchangeAge(int id1,int id2,int age);
}
