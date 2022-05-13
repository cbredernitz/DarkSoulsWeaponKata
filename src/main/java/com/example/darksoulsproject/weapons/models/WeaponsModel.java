package com.example.darksoulsproject.weapons.models;

import lombok.Data;

@Data
public class WeaponsModel {
    String name;
    Category category;
    Reinforcement reinforcement;
    String damage;
    String damageReduction;
    String auxEffects;
    String statRequirements;
    String statBonuses;
    Integer critical;
    Float weight;
    Integer stability;
    Integer Durability;
    Integer sellPrice;
    String spellBuff;
    String range;
    boolean buffable;
    boolean infusable;
}