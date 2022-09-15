package na.pham.address.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import na.pham.address.address.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
