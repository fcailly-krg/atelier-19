package com.krgcorporate.dip.repository;

import com.krgcorporate.dip.service.ContractPersistence;
import com.krgcorporate.dip.domain.Contract;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
public class ContractRepository implements ContractPersistence {

    private Map<Integer, Contract> contracts;

    public Optional<Contract> findById(int id) {
        return Optional.ofNullable(contracts.get(id));
    }

    public List<Contract> findAll() {
        return new ArrayList<>(contracts.values());
    }
}
