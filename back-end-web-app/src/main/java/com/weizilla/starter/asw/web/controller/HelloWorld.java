package com.weizilla.starter.asw.web.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class HelloWorld
{
    @RequestMapping("/")
    public String index()
    {
        return "Hello Spring Boot with hot reload " + Instant.now();
    }

    @RequestMapping(path = "/api/hello", method = RequestMethod.POST)
    public Response sayHello(@RequestBody Request request)
    {
        return new Response("Hello " + request.name + "!");
    }
}

class Request
{
    public final String name;
    @JsonCreator
    Request(@JsonProperty("name") String name)
    {
        this.name = name;
    }
}

class Response
{
    public final String response;
    @JsonCreator
    Response(@JsonProperty("response") String response)
    {
        this.response = response;
    }
}
