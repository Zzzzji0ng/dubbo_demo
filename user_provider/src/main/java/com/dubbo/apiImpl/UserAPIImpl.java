package com.dubbo.apiImpl;

import com.dubbo.api.UserAPI;
import com.dubbo.config.OrderProperties;
import com.dubbo.dto.UserInfoDTO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Random;
import java.util.UUID;

@DubboService
@Component
public class UserAPIImpl implements UserAPI {

    @Autowired
    private OrderProperties orderProperties;
    @Override
    public UserInfoDTO getUserInfo(String userName) {
        Assert.notNull(userName, "userName not be null");

        return new UserInfoDTO("RandomName-" + new Random().nextInt() + userName , UUID.randomUUID(), orderProperties.getInfo());
    }
}
