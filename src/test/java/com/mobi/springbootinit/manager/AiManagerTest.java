package com.mobi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat() {
        String doChat = aiManager.doChat(1683146710307680257L,"分析需求：\n" +
                "分析网站用户的增长情况\n" +
                "原始数据：\n" +
                "日期，用户数\n" +
                "1号，10\n" +
                "2号，30\n" +
                "3号，50");
        System.out.println(doChat);
    }
}