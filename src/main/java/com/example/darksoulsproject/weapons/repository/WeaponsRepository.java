package com.example.darksoulsproject.weapons.repository;

import com.example.darksoulsproject.weapons.models.Category;
import com.example.darksoulsproject.weapons.models.Reinforcement;
import com.example.darksoulsproject.weapons.models.WeaponsModel;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class WeaponsRepository {

    private static final String RESOURCE = "src/main/resources/DS3_weapon_structured.csv";
    private final static List<WeaponsModel> WEAPONS = new ArrayList<>();

    public WeaponsRepository() {
        try {
            Reader reader = Files.newBufferedReader(Path.of(RESOURCE));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                List<String> record = Arrays.asList(nextRecord);
                System.out.println(record);
                WeaponsModel weapon = WeaponsModel.builder()
                    .name(record.get(0))
                    .category(Category.valueOf(record.get(1)))
                    .reinforcement(Reinforcement.valueOf(record.get(2)))
                    .damage(record.get(3))
                    .damageReduction(record.get(4))
                    .auxEffects(record.get(5))
                    .statRequirements(record.get(6))
                    .statBonuses(record.get(7))
                    .critical(Integer.valueOf(record.get(8)))
                    .weight(Float.valueOf(record.get(9)))
                    .stability(Integer.valueOf(record.get(10)))
                    .durability(Integer.valueOf(record.get(11)))
                    .sellPrice(Float.valueOf(record.get(12)))
                    .spellBuff(record.get(13))
                    .range(record.get(14))
                    .buffable(Boolean.parseBoolean(record.get(15)))
                    .infusable(Boolean.parseBoolean(record.get(16))).build();
                System.out.println(weapon);
                WEAPONS.add(weapon);
            }
        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
        }
    }
}