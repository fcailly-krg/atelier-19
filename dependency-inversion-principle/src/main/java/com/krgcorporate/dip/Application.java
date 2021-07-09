package com.krgcorporate.dip;

import com.krgcorporate.dip.service.ContractService;
import com.krgcorporate.dip.domain.Contract;
import com.krgcorporate.dip.repository.ContractRepository;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        final var contracts = new HashMap<Integer, Contract>();
        contracts.put(1, new Contract("John"));
        contracts.put(2, new Contract("Susan"));
        final var customerService = new ContractService(new ContractRepository(contracts));
        customerService.findAll().forEach(System.out::println);
    }
}
