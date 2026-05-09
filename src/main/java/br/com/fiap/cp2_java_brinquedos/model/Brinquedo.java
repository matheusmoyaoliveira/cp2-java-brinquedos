package br.com.fiap.cp2_java_brinquedos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brinquedo_seq")
    @SequenceGenerator(
            name = "brinquedo_seq",
            sequenceName = "SEQ_TDS_TB_BRINQUEDOS",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "TIPO", nullable = false, length = 80)
    private String tipo;

    @Column(name = "CLASSIFICACAO", nullable = false, length = 30)
    private String classificacao;

    @Column(name = "TAMANHO", nullable = false, length = 50)
    private String tamanho;

    @Column(name = "PRECO", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    public Brinquedo() {
    }

    public Brinquedo(Long id, String nome, String tipo, String classificacao, String tamanho, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}