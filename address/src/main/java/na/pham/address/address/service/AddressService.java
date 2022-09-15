package na.pham.address.address.service;

import na.pham.address.address.entity.Address;
import na.pham.address.address.repository.AddressRepository;
import na.pham.address.address.request.CreateAddressRequest;
import na.pham.address.address.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address();
        address.setCity(createAddressRequest.getCity());
        address.setStreet(createAddressRequest.getStreet());

        addressRepository.save(address);
        return new AddressResponse(address);
    }

    public AddressResponse getById(Long id) {
        Address address = addressRepository.findById(id).get();
        return new AddressResponse(address);
    }
}
