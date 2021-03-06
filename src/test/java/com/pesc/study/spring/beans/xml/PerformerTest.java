package com.pesc.study.spring.beans.xml;

import com.pesc.study.spring.beans.xml.exceptions.PerformanceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-beans-xml.xml"})
public class PerformerTest {

    @Autowired
    @Qualifier("duke")
    Performer duke;

    @Autowired
    @Qualifier("jack")
    Performer jack;

    @Autowired
    @Qualifier("mice")
    Performer mice;

    @Test
    public void testDuke() throws PerformanceException {
        duke.perform();
    }

    @Test
    public void testJack() throws PerformanceException {
        jack.perform();
    }

    @Test
    public void testMice() throws PerformanceException{
        mice.perform();
    }

}