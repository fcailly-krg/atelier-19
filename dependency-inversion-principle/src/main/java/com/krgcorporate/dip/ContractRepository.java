package com.krgcorporate.dip;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
public class ContractRepository {

    private Map<Integer, Contract> contracts;

    public Optional<Contract> findById(int id) {
        return Optional.ofNullable(contracts.get(id));
    }

    public List<Contract> findAll() {
        return new ArrayList<>(contracts.values());
    }
}
