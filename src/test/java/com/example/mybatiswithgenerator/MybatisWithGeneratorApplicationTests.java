package com.example.mybatiswithgenerator;

import com.demo.MybatisWithGeneratorApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisWithGeneratorApplication.class)
public class MybatisWithGeneratorApplicationTests {

    @Autowired
    //private GirlService girlService;

    @Test
    public void contextLoads() {
        //addGirl();
        //selectGirl();
    }

//    public void addGirl(){
//        Girl girl = new Girl();
//        int id = 001;
//        String name = "妲己";
//        String cup = "C";
//        girl.setId(id);
//        girl.setCup(cup);
//        girl.setName(name);
//        girlService.addGirl(girl);
//    }
//
//    public void selectGirl(){
//        int id = 001;
//        Girl girl = girlService.selectGirl(id);
//        System.out.print(girl.getName()+"--"+girl.getCup());
//    }

}
