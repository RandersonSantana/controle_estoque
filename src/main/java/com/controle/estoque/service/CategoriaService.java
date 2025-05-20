package com.controle.estoque.service;

import com.controle.estoque.dtos.CategoriaDTO;
import com.controle.estoque.entities.Categoria;
import com.controle.estoque.exceptions.BussinesException;
import com.controle.estoque.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    private static final String MSG_BARBEIRO = "Barbeiro não encontrado";

    public CategoriaDTO converterCategoriaParaDTO(Categoria categoria){
        CategoriaDTO categoriaDTO = new CategoriaDTO(
                categoria.getId(),
                categoria.getNome());
        return categoriaDTO;
    }
    public Categoria converterCategoriaDTOParaCategoria(CategoriaDTO categoriaDTO){
        Categoria categoria = new Categoria(
                categoriaDTO.getId(),
                categoriaDTO.getNome()
        );
        return categoria;
    }

    public CategoriaDTO cadastrarCategoria(CategoriaDTO categoriaDTO){
        Categoria categoria = converterCategoriaDTOParaCategoria(categoriaDTO);
        categoria = categoriaRepository.save(categoria);
        return converterCategoriaParaDTO(categoria);
    }

    public CategoriaDTO atualizarCategoria(CategoriaDTO categoriaDTO){
        categoriaRepository.findById(categoriaDTO.getId());

        Categoria categoria = converterCategoriaDTOParaCategoria(categoriaDTO);
        categoriaRepository.save(categoria);
        return converterCategoriaParaDTO(categoria);
    }

    public CategoriaDTO buscarCategoriaPorId(Long id){
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new BussinesException(MSG_BARBEIRO));
        return converterCategoriaParaDTO(categoria);
    }
    public List<CategoriaDTO> buscarTodasCategorias(){
        List<Categoria> categorias = categoriaRepository.findAll();
        List<CategoriaDTO> categoriaDTOs = new ArrayList<>();
        for (Categoria categoria : categorias) {
            categoriaDTOs.add(converterCategoriaParaDTO(categoria));
        }
        return categoriaDTOs;
    }

    public void deletarCategoria(Long id){
        categoriaRepository.deleteById(id);
    }
}
