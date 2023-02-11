package com.qwerty.project.projectzero.controller;

import com.qwerty.project.projectzero.model.purchase.Purchase;
import com.qwerty.project.projectzero.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/purchase")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @GetMapping
    public List<Purchase> getPurchase() {
        return purchaseRepository.findAll();
    }

}
