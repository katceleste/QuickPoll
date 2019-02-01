package com.apress.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apress.domain.Vote;

// Because the OptionRepository works with the Option domain object
// it passes Option and Long as generic parameter values
@Repository
public interface OptionRepository extends CrudRepository<Vote, Long> {
}
