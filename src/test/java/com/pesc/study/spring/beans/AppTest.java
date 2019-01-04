package com.pesc.study.spring.beans;

import com.pesc.study.spring.beans.xml.Performer;
import com.pesc.study.spring.beans.xml.exceptions.PerformanceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-beans-xml.xml"})
public class AppTest
{
    @Autowired //自动装配
    @Qualifier("juggler") //指定bean的名称
    private Performer juggler;

    /**
     * Create the test case
     */
    public AppTest(  )
    {
        super();
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() throws PerformanceException {
        juggler.perform();
    }
}
