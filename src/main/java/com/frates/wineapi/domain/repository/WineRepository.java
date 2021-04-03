package com.frates.wineapi.domain.repository;

import com.frates.wineapi.domain.model.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Long> {

}
