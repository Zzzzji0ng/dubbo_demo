package com.dubbo.api;

import com.dubbo.dto.UserInfoDTO;

public interface UserAPI {

    UserInfoDTO getUserInfo(String userName);

}
