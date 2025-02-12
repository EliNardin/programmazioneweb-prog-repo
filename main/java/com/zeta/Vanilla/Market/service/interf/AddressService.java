package com.zeta.Vanilla.Market.service.interf;

import com.zeta.Vanilla.Market.dto.AddressDto;
import com.zeta.Vanilla.Market.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
