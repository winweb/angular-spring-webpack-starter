package com.weizilla.starter.asw.web.test;

import com.google.common.base.Charsets;
import org.springframework.http.MediaType;

public class WebTestUtils
{
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(
        MediaType.APPLICATION_JSON.getType(),
        MediaType.APPLICATION_JSON.getSubtype()
    );
}
