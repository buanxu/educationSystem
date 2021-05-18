package com.buanxu.educationSystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class CrmApplicationTests {

    @Test
    void contextLoads() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String date="1997/11/05";

        Date parse = simpleDateFormat.parse(date);
        System.out.println(parse);
    }

}
