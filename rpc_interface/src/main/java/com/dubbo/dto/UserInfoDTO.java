package com.dubbo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO implements Serializable {

    private static final long serialVersionUID = -1940683254656491629L;

    private String userName;

    private UUID userId;

    private String info;

}
