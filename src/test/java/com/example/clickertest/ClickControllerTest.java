package com.example.clickertest;


import com.example.clickertest.controller.ClickController;
import com.example.clickertest.model.Click;
import com.example.clickertest.repository.ClickerRepository;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClickControllerTest {
    @Autowired
    private ClickController clickController;

    @MockBean
    private ClickerRepository clickerRepository;

    @Test
    public void addUser(){
        Click click = new Click();
        Assert.assertEquals(0,click.getClickAmount());
    }
}
