package com.controle.estoque.dtos;

import java.util.Date;

public class EntradaEstoqueDTO {
    private Long id;

    private String produto;

    private Double quantidade;

    private Date data;

    private String observacao;

    public EntradaEstoqueDTO() {
    }

    public EntradaEstoqueDTO(Long id, String produto, Double quantidade, Date data, String observacao) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
