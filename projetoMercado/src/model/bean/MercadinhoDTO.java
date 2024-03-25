/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;
import java.sql.Time;



/**
 *
 * @author Senai
 */
public class MercadinhoDTO {
    //Tabela usuario
    private int idUsuario;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String endereco;
    //----------------------------------
    //Tabela admin
    private int idAdmin;
    private String nomeAdm;
    private String loginAdm;
    private String senhaAdm;
    //----------------------------------
    //Tabela produto
    private int idProduto;
    private String nomeProduto;
    private String descricao;
    private float preco;
    private int estoque;
    //----------------------------------
    //Tabela venda
    private int idVenda;
    private Date dataVenda;
    private float precoTotal;
    private int quantidadeProduto;
    private int id_Usuario;
    private int id_Produto;
    //----------------------------------
    //Tabela backupUsuario
    private int idBackup;
    private String nomeBackup;
    private String loginBackup;
    private String senhaBackup;
    private String telefoneBackup;
    private String enderecoBackup;
    private Time exclusaoUsuario;

    public MercadinhoDTO() {
    }

    public MercadinhoDTO(int idUsuario, String nome, String login, String senha, String telefone, String endereco, int idAdmin, String nomeAdm, String loginAdm, String senhaAdm, int idProduto, String nomeProduto, String descricao, float preco, int estoque, int idVenda, Date dataVenda, float precoTotal, int quantidadeProduto, int id_Usuario, int id_Produto, int idBackup, String nomeBackup, String loginBackup, String senhaBackup, String telefoneBackup, String enderecoBackup, Time exclusaoUsuario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idAdmin = idAdmin;
        this.nomeAdm = nomeAdm;
        this.loginAdm = loginAdm;
        this.senhaAdm = senhaAdm;
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.precoTotal = precoTotal;
        this.quantidadeProduto = quantidadeProduto;
        this.id_Usuario = id_Usuario;
        this.id_Produto = id_Produto;
        this.idBackup = idBackup;
        this.nomeBackup = nomeBackup;
        this.loginBackup = loginBackup;
        this.senhaBackup = senhaBackup;
        this.telefoneBackup = telefoneBackup;
        this.enderecoBackup = enderecoBackup;
        this.exclusaoUsuario = exclusaoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public String getLoginAdm() {
        return loginAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public int getId_Produto() {
        return id_Produto;
    }

    public int getIdBackup() {
        return idBackup;
    }

    public String getNomeBackup() {
        return nomeBackup;
    }

    public String getLoginBackup() {
        return loginBackup;
    }

    public String getSenhaBackup() {
        return senhaBackup;
    }

    public String getTelefoneBackup() {
        return telefoneBackup;
    }

    public String getEnderecoBackup() {
        return enderecoBackup;
    }

    public Time getExclusaoUsuario() {
        return exclusaoUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    }

    public void setIdBackup(int idBackup) {
        this.idBackup = idBackup;
    }

    public void setNomeBackup(String nomeBackup) {
        this.nomeBackup = nomeBackup;
    }

    public void setLoginBackup(String loginBackup) {
        this.loginBackup = loginBackup;
    }

    public void setSenhaBackup(String senhaBackup) {
        this.senhaBackup = senhaBackup;
    }

    public void setTelefoneBackup(String telefoneBackup) {
        this.telefoneBackup = telefoneBackup;
    }

    public void setEnderecoBackup(String enderecoBackup) {
        this.enderecoBackup = enderecoBackup;
    }

    public void setExclusaoUsuario(Time exclusaoUsuario) {
        this.exclusaoUsuario = exclusaoUsuario;
    }
    
    
    
    
}
