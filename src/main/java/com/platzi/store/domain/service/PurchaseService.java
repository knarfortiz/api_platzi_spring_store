package com.platzi.store.domain.service;

import com.platzi.store.domain.Purchase;
import com.platzi.store.domain.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    private final PurchaseRepository repository;

    public PurchaseService(PurchaseRepository repository) {
        this.repository = repository;
    }

    public List<Purchase> getAll() {
        return repository.getAll();
    }

    public Optional<List<Purchase>> getByClient(String clientId) {
        return repository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return repository.save(purchase);
    }
}
