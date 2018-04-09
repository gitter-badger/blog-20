package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Create by PengLiang on 2018/4/9 0009.
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getUserInfoAll() {
        return restTemplate.getForObject("http://blog-user-client/user/getUserInfoAll", List.class);
    }
}
