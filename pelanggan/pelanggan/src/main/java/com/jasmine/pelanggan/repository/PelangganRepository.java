package com.jasmine.pelanggan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jasmine.pelanggan.model.pelanggan;

public interface PelangganRepository extends JpaRepository<pelanggan, Long> {

}