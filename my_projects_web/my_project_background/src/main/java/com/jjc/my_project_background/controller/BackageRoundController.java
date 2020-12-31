package com.jjc.my_project_background.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Api(value = "后台管理平台")
@RestController
@RequestMapping(value = "backageRoundController", produces = APPLICATION_JSON_UTF8_VALUE)
public class BackageRoundController {

    private static final Logger LOG = LoggerFactory.getLogger(BackageRoundController.class);



}
