package com.zeta.Vanilla.Market.service.impl;

import com.zeta.Vanilla.Market.dto.AddressDto;
import com.zeta.Vanilla.Market.dto.Response;
import com.zeta.Vanilla.Market.entity.Address;
import com.zeta.Vanilla.Market.entity.User;
import com.zeta.Vanilla.Market.repository.AddressRepository;
import com.zeta.Vanilla.Market.service.interf.AddressService;
import com.zeta.Vanilla.Market.service.interf.UserService;
//import com.zeta.Vanilla.Market.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final UserService userService;


    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null){
            Address newAddress = new Address();
            newAddress.setUser(user);
            address = newAddress;
        }
        if (addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if (addressDto.getState() != null) address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepository.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }


}
