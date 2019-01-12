package com.pesc.study.spring.beans.xml;

public class JinYePoem implements Poem {

    private static String LINES = "静夜思\n" +
            "李白\n" +
            "窗前明月光\n" +
            "疑是地上霜\n" +
            "举头望明月\n" +
            "低头思故乡";

    public void recite() {
        System.out.println(LINES);
    }

}
