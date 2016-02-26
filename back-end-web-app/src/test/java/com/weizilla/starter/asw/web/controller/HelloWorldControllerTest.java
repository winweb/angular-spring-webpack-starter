package com.weizilla.starter.asw.web.controller;

import com.weizilla.starter.asw.web.converter.JsonMessageConverter;
import com.weizilla.starter.asw.web.converter.ObjectMappers;
import com.weizilla.starter.asw.web.test.WebTestUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloWorldControllerTest
{
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception
    {
        HelloWorldController controller = new HelloWorldController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
            .setMessageConverters(new JsonMessageConverter())
            .build();
    }

    @Test
    public void shouldReturnNameFromApi() throws Exception
    {
        String name = "MY NAME";
        Request request = new Request(name);
        String json = ObjectMappers.OBJECT_MAPPER.writeValueAsString(request);

        MockHttpServletRequestBuilder post = post("/api/hello")
            .contentType(WebTestUtils.APPLICATION_JSON_UTF8)
            .content(json);

        mockMvc.perform(post)
            .andExpect(status().isOk())
            .andExpect(content().contentType(WebTestUtils.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("response", containsString(name)));

    }
}