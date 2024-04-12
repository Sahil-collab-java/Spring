package com.SpringJUnit;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.http.MediaType;

import com.SpringJUnit.service.MyService;



@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {


	 private final Calculator calculator = new Calculator();
	 private final PalindromeCheck palindromeCheck = new PalindromeCheck();

//	    @Test
//	    void addition() {
//	        assertEquals(2, calculator.add(1, 1));
//	    }
//	    @Test
//	    void multiplication() {
//	        assertEquals(4, calculator.mul(2, 2));
//	    }
//	    
//	    
//	    @ParameterizedTest
//	    @ValueSource(strings = {"liril", "madam", "racecar", "ashsa"})
//	    void checkPalidrome(String str) {
//	    boolean aatual = palindromeCheck.isPalidrome(str);
//	    
//	    assertTrue(aatual);
//	    	
//	    }
	 
	 
	 @MockBean
	 private MyService myService;
	 
	
	 @Autowired
	  private MockMvc mockMvc;

	 
	 
	 @Test
	    void testGreet() throws Exception {
	        // Mocking the behavior of MyService
	        when(myService.getTheGreetMsg()).thenReturn("Good Morning !!!!");

	        // Perform GET request to "/greet" endpoint
	        mockMvc.perform(MockMvcRequestBuilders.get("/greet").contentType(MediaType.APPLICATION_JSON))
	                // Verify that the response has status code 200
	                .andExpect(MockMvcResultMatchers.status().isOk())
	                // Verify that the response contains the expected message
	                .andExpect(MockMvcResultMatchers.content().string("Good Morning !!!!"));
	    }
	 
	 
	 
//	 @Test
//	 public void testWelcome() throws Exception {
//		 when(myService.getTheGreetMsg()).thenReturn("Good Morning !!!!");
//		  
//		 MockHttpServletRequestBuilder builder =  MockMvcRequestBuilders.get("/greet");
//		 
//		 MvcResult mvcResult = mockMvc.perform(builder).andReturn();
//		 
//		 MockHttpServletResponse httpServletResponse = mvcResult.getResponse();
//		 
//		 int status = httpServletResponse.getStatus();
//		 
//		// System.out.println(status);
//		 
//		 assertEquals(200, status);
//		 
//		
//	}
	    
	    
}
