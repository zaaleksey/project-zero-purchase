package com.qwerty.project.projectzero.model.purchase;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PurchaseType {

    UNKNOWN(1, "Неизвестно"),
    TRANSFER(2, "Перевод"),
    TRANSPORT(3, "Транспорт"),
    FOOD(4, "Еда"),
    CLOTH(5, "Одежда"),
    HEALTH(6, "Здоровье"),
    GIFT(7, "Подарки"),
    TECHNIQUE(8, "Техника");

    private final int code;
    private final String name;
}
