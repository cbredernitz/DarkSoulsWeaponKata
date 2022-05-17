package com.example.darksoulsproject.weapons.repository;

import com.example.darksoulsproject.weapons.models.WeaponsModel;
import com.opencsv.CSVReader;
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

    private static final String RESOURCE = "src/main/resources/DS3_weapon.csv";
    private final static List<WeaponsModel> WEAPONS = new ArrayList<>();

    public WeaponsRepository() {
        try {
            Reader reader = Files.newBufferedReader(Path.of(RESOURCE));
            CSVReader csvReader = new CSVReader(reader);

            String[] nextRecord;
            while((nextRecord = csvReader.readNext()) != null) {
                if (!nextRecord[0].contains("Name")) {
                    System.out.println(Arrays.toString(nextRecord));
                    String[] record = nextRecord[0].split(",");
                    WeaponsModel weapon = WeaponsModel.builder().build();
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}