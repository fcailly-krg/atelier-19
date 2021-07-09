package com.krgcorporate.dip;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ContractService {

    private final ContractRepository contractRepository;

    public Optional<Contract> findById(int id) {
        return contractRepository.findById(id);
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
