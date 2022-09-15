package na.pham.address.address.response;

import lombok.Getter;
import lombok.Setter;
import na.pham.address.address.entity.Address;

@Getter
@Setter
public class AddressResponse {
    private Long addressId;
    private String street;
    private String city;

    public AddressResponse(Address address) {
        this.addressId = address.getId();
        this.street = address.getStreet();
        this.city = address.getCity();
    }
}
