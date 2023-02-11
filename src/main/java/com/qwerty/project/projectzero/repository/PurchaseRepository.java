package com.qwerty.project.projectzero.repository;

import com.qwerty.project.projectzero.model.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
}
