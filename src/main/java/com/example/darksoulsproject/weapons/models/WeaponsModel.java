package com.example.darksoulsproject.weapons.models;

import com.opencsv.bean.CsvBindByName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeaponsModel {
    @CsvBindByName(column = "Name")
    String name;

    @CsvBindByName(column = "Category")
    Category category;

    @CsvBindByName(column = "Reinforcement")
    Reinforcement reinforcement;

    @CsvBindByName(column = "Damage")
    String damage;

    @CsvBindByName(column = "Damage Reduction")
    String damageReduction;

    @CsvBindByName(column = "Aux Effects")
    String auxEffects;

    @CsvBindByName(column = "Stat Requirements")
    String statRequirements;

    @CsvBindByName(column = "Stat Bonuses")
    String statBonuses;

    @CsvBindByName(column = "Critical")
    Integer critical;

    @CsvBindByName(column = "Weight")
    Float weight;

    @CsvBindByName(column = "Stability")
    Integer stability;

    @CsvBindByName(column = "Durability")
    Integer durability;

    @CsvBindByName(column = "Sell Price")
    Integer sellPrice;

    @CsvBindByName(column = "Spell Buff")
    String spellBuff;

    @CsvBindByName(column = "Range")
    String range;

    @CsvBindByName(column = "Buffable")
    boolean buffable;

    @CsvBindByName(column = "Infusable")
    boolean infusable;
}