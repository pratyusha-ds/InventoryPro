package com.example.inventorypro.controller;

import com.example.inventorypro.model.Asset;
import com.example.inventorypro.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @GetMapping
    public List<Asset> getAll() {
        return assetService.getAllAssets();
    }

    @PostMapping
    public Asset create(@RequestBody Asset asset) {
        return assetService.saveAsset(asset);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        assetService.deleteAsset(id);
    }

    @GetMapping("/search")
    public List<Asset> search(@RequestParam String name) {
        return assetService.searchByName(name);
    }
}
