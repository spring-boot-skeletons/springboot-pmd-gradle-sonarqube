package com.springboot.gradle.sonarqube.api.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "test")
@WebMvcTest(value = ApiController.class)
public class ApiControllerTest {
	
    private static final String PING_RESPONSE_PONG = "pong";

	private static final String CODING_STANDARDS_PING = "/coding-standards/ping";
    
	@Autowired
    private MockMvc mockMvc;

    @Test
    public void pingTest() throws Exception {
    	MvcResult result = 
    			mockMvc
                .perform(MockMvcRequestBuilders.get(CODING_STANDARDS_PING))
                .andExpect(status().isOk()).andReturn();
    	
    	assertEquals(PING_RESPONSE_PONG, result.getResponse().getContentAsString());
    }
}