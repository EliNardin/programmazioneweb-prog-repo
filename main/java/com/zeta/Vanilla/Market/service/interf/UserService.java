package com.zeta.Vanilla.Market.service.interf;

import com.zeta.Vanilla.Market.dto.LoginRequest;
import com.zeta.Vanilla.Market.dto.Response;
import com.zeta.Vanilla.Market.dto.UserDto;
import com.zeta.Vanilla.Market.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest) ;
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
