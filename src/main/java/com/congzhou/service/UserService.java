package com.congzhou.service;

import com.congzhou.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void say();
    public List<User> getList();
}
