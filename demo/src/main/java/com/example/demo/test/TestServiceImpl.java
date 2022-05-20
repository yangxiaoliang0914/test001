package com.example.demo.test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    public List<String> getName(){
        List list = new ArrayList();
        list.add("你好");
        list.add("springboot");
        list.add("springcloud");
        list.add("mybatice");
        list.add("<h1>nihao</h1>");
        list.add("lllllllll");
        return list;
    }

}
