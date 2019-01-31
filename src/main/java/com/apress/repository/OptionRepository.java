package com.apress.repository;

import org.springframework.stereotype.Repository;

// Because the OptionRepository works with the Option domain object
// it passes Option and Long as generic parameter values
@Repository
public interface OptionRepository {
}
