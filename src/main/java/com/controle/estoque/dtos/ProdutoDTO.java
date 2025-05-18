package com.controle.estoque.dtos;

public class ProdutoDTO{
        private Long id;
        private String nome;
        private String descricao;
        private CategoriaDTO categoria;
        private FornecedorDTO fornecedor;
        private String quantidadeAtual;

        public ProdutoDTO() {
        }

    public ProdutoDTO(Long id, String nome, String descricao, FornecedorDTO fornecedor, CategoriaDTO categoria,
                      String quantidadeAtual) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.quantidadeAtual = quantidadeAtual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public FornecedorDTO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorDTO fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(String quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

}
