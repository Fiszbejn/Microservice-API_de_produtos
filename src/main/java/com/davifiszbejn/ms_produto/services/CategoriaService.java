package com.davifiszbejn.ms_produto.services;

import com.davifiszbejn.ms_produto.dto.CategoriaDTO;
import com.davifiszbejn.ms_produto.entities.Categoria;
import com.davifiszbejn.ms_produto.exceptions.DatabaseException;
import com.davifiszbejn.ms_produto.exceptions.ResourceNotFoundException;
import com.davifiszbejn.ms_produto.repositories.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional(readOnly = true)
    public List<CategoriaDTO> findAllCategorias() {
        return categoriaRepository.findAll().stream().map(CategoriaDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public CategoriaDTO findCategoriaById(Long id) {

        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado. ID: " + id));

        return new CategoriaDTO(categoria);
    }

    @Transactional
    public CategoriaDTO saveCategoria(CategoriaDTO inputDTO) {
        Categoria categoria = new Categoria();
        copyDtoToCategoria(inputDTO, categoria);
        categoria = categoriaRepository.save(categoria);
        return new CategoriaDTO(categoria);
    }

    @Transactional
    public CategoriaDTO updateCategoria(Long id, CategoriaDTO inputDTO) {
        try {
            Categoria categoria = categoriaRepository.getReferenceById(id);
            copyDtoToCategoria(inputDTO, categoria);
            categoria = categoriaRepository.save(categoria);
            return new CategoriaDTO(categoria);
        } catch (EntityNotFoundException ex) {
            throw new ResourceNotFoundException("Recurso não encontrado. ID: " + id);
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void deleteCategoriaById(Long id) {
        if(!categoriaRepository.existsById(id)) {
            throw new ResourceNotFoundException("Recurso não encontrado. ID: " + id);
        }

        try {
            categoriaRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Não foi possível excluir a categoria. Existem produtos associados a ela.");
        }

        categoriaRepository.deleteById(id);
    }

    private void copyDtoToCategoria(CategoriaDTO inputDTO, Categoria categoria) {
        categoria.setNome(inputDTO.getNome());
    }
}
