package com.controle.estoque.controller;

import com.controle.estoque.dtos.CategoriaDTO;
import com.controle.estoque.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaaController {
@Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> buscarCategoriaPorId(@PathVariable Long id){
        return ResponseEntity.ok(categoriaService.buscarCategoriaPorId(id));
    }
    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> buscarTodasCategorias(){
        return ResponseEntity.ok(categoriaService.buscarTodasCategorias());
    }
    @PostMapping
    public ResponseEntity<CategoriaDTO> CadastrarCategoria(@RequestBody CategoriaDTO categoriaDTO){
        CategoriaDTO categoria = categoriaService.cadastrarCategoria(categoriaDTO);
        return ResponseEntity.ok(categoria);
    }
    @PutMapping
    public ResponseEntity<CategoriaDTO> atualizarCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return ResponseEntity.ok(categoriaService.atualizarCategoria(categoriaDTO));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarCategoria(@RequestBody CategoriaDTO categoriaDTO){
        categoriaService.deletarCategoria(categoriaDTO.getId());
        return ResponseEntity.noContent().build();
    }
}
