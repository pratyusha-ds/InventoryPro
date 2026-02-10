package com.example.inventorypro.repository;

import com.example.inventorypro.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    List<Asset> findByNameContainingIgnoreCase(String name);
}