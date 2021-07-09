package com.krgcorporate.dip.service;

import com.krgcorporate.dip.domain.Contract;

import java.util.List;
import java.util.Optional;

public interface ContractPersistence {

    Optional<Contract> findById(int id);

    List<Contract> findAll();
}
