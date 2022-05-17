package com.example.darksoulsproject.weapons.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WeaponsRepositoryTest {

    WeaponsRepository weaponsRepository;

    @BeforeEach
    void setUp() {

    }

    @Test
    void shouldThrowErrorWhenResourceDoesNotExist() {

        assertThrows(IOException.class, WeaponsRepository::new);
    }

}