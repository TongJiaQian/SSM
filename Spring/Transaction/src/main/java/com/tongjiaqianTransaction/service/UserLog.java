package com.tongjiaqianTransaction.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface UserLog {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(int id1, int id2, int age, String msg);
}
