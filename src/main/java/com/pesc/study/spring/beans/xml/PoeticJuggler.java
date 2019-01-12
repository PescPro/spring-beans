package com.pesc.study.spring.beans.xml;

import com.pesc.study.spring.beans.xml.exceptions.PerformanceException;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags,Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    /**
     * 表演方法
     */
    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting ...");
        poem.recite();
    }
}
