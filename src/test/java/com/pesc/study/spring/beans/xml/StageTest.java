package com.pesc.study.spring.beans.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-beans-xml.xml"})
public class StageTest {

    @Autowired
    @Qualifier("stage")
    Stage stage;

    public StageTest(){

    }

    @Test
    public void testState(){
        stage.turnOnLights();
    }

}