package com.krgcorporate.dip.service;

import com.krgcorporate.dip.domain.Contract;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ContractService {

    private final ContractPersistence contractPersistence;

    public Optional<Contract> findById(int id) {
        return contractPersistence.findById(id);
    }

    public List<Contract> findAll() {
        return contractPersistence.findAll();
    }
}
