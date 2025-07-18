package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class Demo1ApplicationTests {

    @Autowired
    private MockMvc mockMvc;
// test success
    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(view().name("hello"));
    }

//    @Test
//    public void testHelloReturns404() throws Exception {
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isNotFound()); // Mong huytest
//    }
}
