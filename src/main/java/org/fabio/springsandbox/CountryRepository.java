package org.fabio.springsandbox;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

    @Query(value = """
                select c.name as name
                from Country c
                where c.name like :name
            """)
    Page<CountryProjection> customFindCountryByName(@Param("name") String name, Pageable pageable);
}
