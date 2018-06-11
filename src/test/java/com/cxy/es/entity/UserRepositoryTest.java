package com.cxy.es.entity;

import com.cxy.es.ApplicationTests;
import com.cxy.es.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user=userRepository.findOne(1L);
        Assert.assertEquals("wali",user.getName());
    }
}
