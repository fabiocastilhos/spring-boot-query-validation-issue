package org.fabio.springsandbox;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    Page<CountryProjection> findByCustomParameter(String parameter) {
        return countryRepository.customFindCountryByName(parameter, Pageable.ofSize(10));
    }
}
