package com.pesc.study.spring.beans.xml;

public class Stage {

    private Stage(){

    }

    public void turnOnLights() {
        System.out.println("all lights on");
    }

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

}
