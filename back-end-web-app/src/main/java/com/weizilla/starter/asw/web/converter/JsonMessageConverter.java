package com.weizilla.starter.asw.web.converter;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;

@Component
public class JsonMessageConverter extends MappingJackson2HttpMessageConverter
{
    public JsonMessageConverter()
    {
        super(ObjectMappers.OBJECT_MAPPER);
    }
}
