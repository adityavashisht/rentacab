package com.indasil.rentacab.service.test;

import com.indasil.rentacab.service.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vashishta on 10/15/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/rentacab-service.xml"})

public class RentCabServiceTest {

    @Autowired
    private MainService mainService;

    @Test
    public void testLoggerAspect() {

        mainService.rent();

    }
}
