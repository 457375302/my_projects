package com.jjc.my_project_blog.user.controller;

import com.jjc.my_project_blog.config.MessageKeys;
import com.jjc.my_project_blog.config.RestRespCode;
import com.jjc.my_project_blog.user.vo.UserVo;
import com.jjc.util.resp.RestResponse;
import com.jjc.util.sysutil.JsonMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Api(value = "用户模块")
@RestController
@RequestMapping(value = "userController", produces = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/housepagelist" , method = RequestMethod.POST)
    @ApiOperation("用户注册")
    public RestResponse<Boolean> addKnowledgeGroup(
            @RequestBody @ApiParam(value = "用户注册入参") UserVo vo,
            BindingResult result) {

        // 入参验证
        if (result.hasErrors()) {
            return new RestResponse<>(RestRespCode.PARAM_ERROR, MessageKeys.FIELD_VALID_NOTNULL, null);
        }
        RestResponse<Boolean> rest;

        try {
            rest =null;

            if (!rest.isSuccess()) {
                return new RestResponse<>(rest.getCode(), rest.getMsg(), rest.getData());
            }
        } catch (Exception ex) {
            LOG.error("authApi=>addKnowledgeGroup=" + JsonMapper.toJson(vo), ex.getMessage(), ex);
            return new RestResponse<Boolean>(RestRespCode.SYS_ERROR, MessageKeys.SYS_ERROR, false);
        }

        return new RestResponse<Boolean>(RestRespCode.SUCCESS, MessageKeys.SYSTEM_SUCCESS, rest.getData());
    }
}
