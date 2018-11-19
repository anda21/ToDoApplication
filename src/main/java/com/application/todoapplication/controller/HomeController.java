package com.application.todoapplication.controller;

import com.application.todoapplication.dto.UserGetDto;
import com.application.todoapplication.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(
        tags = {"Home Controller"},
        description = " "
)
@RestController
@RequestMapping( value = "/api", produces = MediaType.APPLICATION_JSON_VALUE )
public class HomeController {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public List<UserGetDto> hello(){
        return userService.findAll();
    }
}
