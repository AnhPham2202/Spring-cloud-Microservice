package na.pham.address.address.controller;

import na.pham.address.address.request.CreateAddressRequest;
import na.pham.address.address.response.AddressResponse;
import na.pham.address.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/{id}")
    public AddressResponse getAddress(@PathVariable Long id) {
        return addressService.getById(id);
    }

    @PostMapping("/")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
        return addressService.createAddress(createAddressRequest);
    }
}
