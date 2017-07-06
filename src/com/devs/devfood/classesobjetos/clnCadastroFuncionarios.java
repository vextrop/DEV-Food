/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devs.devfood.classesobjetos;

import com.dev.devfood.dao.funcionarioControle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class clnCadastroFuncionarios {
    
    funcionarioControle banco = new funcionarioControle();
    
    private int iCod, iRg, iHorasSemanais;
    private String strNOmeCOmpleto, strCpf, strData, strSexo, strEndereco, strUf, strBairro, strCidade, strCargo, strDataContratacao, strDataEnceramento, strDataNascimento;
    private float flValorComissao, flSalarioBase;
    
    
    //---geters---
    public int getCodigo() {
        return this.iCod;
    }

    public int getRg() {
        return this.iRg; 
    }

    public String getNomeCompleto() {
        return this.strNOmeCOmpleto;
    }

    public String getCpf() {
        return this.strCpf;
    }

    public String getDataEnceramento() {
        return this.strData;
    }

    public String getSexo() {
        return this.strSexo;
    }

    public String getEndereco() {
        return this.strEndereco;
    }

    public String getUf() {
        return this.strUf;
    }

    public String getBairro() {
        return this.strBairro;
    }

    public String getCidade() {
        return this.strCidade;
    }

    public String getCargo() {
        return this.strCargo;
    }

    public String getDataContratacao() {
        return this.strDataContratacao;
    }

    public float getValorComissao() {
        return this.flValorComissao;
    }

    public float getValorSalario() {
        return this.flSalarioBase;
    }
    public String getDataNascimento(){
        return this.strDataNascimento;
    }
    public int getHorasSemanais(){
        return this.iHorasSemanais;
    }
    // -- seters --
    public void setCodigo(int iCodigo) {
        this.iCod = iCodigo;
    }

    public void setRg(int iRg) {
        this.iRg = iRg;
    }

    public void setNomeCompleto(String strNomeCompleto) {
        this.strNOmeCOmpleto = strNomeCompleto;
    }

    public void setCpf(String strCpf) {
        this.strCpf = strCpf;
    }

    public void setDataEnceramento(String strData) {
        this.strData = strData;
    }

    public void setSexo(String strSexo) {
        this.strSexo = strSexo;
    }

    public void setEndereco(String strEndereco) {
        this.strEndereco = strEndereco;
    }

    public void setUf(String strUf) {
        this.strUf = strUf;
    }

    public void setBairro(String strBairro) {
        this.strBairro = strBairro;
    }

    public void setCidade(String strCidade) {
        this.strCidade = strCidade;
    }

    public void setCargo(String strCargo) {
        this.strCargo = strCargo;
    }

    public void setDataContratacao(String strDataContratacao) {
        this.strDataContratacao = strDataContratacao;
    }

    public void setValorComissao(float flValorComissao) {
        this.flValorComissao = flValorComissao;
    }

    public void setValorSalario(float flSalario) {
        this.flSalarioBase = flSalario;
    }
    public void setDataNascimento(String strDataNascimento){
        this.strDataNascimento = strDataNascimento;
    }
    public void setHorasSemanais(int iHorasSemanais){
        this.iHorasSemanais = iHorasSemanais;
    }
    //---metodos---
    
    public void imprimirCadastro(){
        
        System.out.println("Codigo" + getCodigo());
        System.out.println("nNome Completo:" + getNomeCompleto());
        System.out.println("Cpf:" + getCpf());
        System.out.println("Rg::" + getRg());
        System.out.println("Data Nascimento:" + getDataNascimento());
        System.out.println("Sexo:" + getSexo());
        System.out.println("Endereço:" + getEndereco());
        System.out.println("nUf:" + getUf());
        System.out.println("Bairro:" + getBairro());
        System.out.println("Cidade:" + getCidade());
        System.out.println("Cargo:" + getCargo());
        System.out.println("Horas Semanais:" + getHorasSemanais());
        System.out.println("Valor Comissao:" + getValorComissao());
        System.out.println("Salario Base:" + getValorSalario());
        System.out.println("Data Contratação:" + getDataContratacao());
        System.out.println("Data Enceramento:" + getDataEnceramento());
    }
    
    //iterações com banco de dados
    public void salvarCadastro(){
        banco.insert(this);//verificar se funciona
    }
    
    public void deletarCadastro(){
        banco.delete(this);//verificar se funciona
    }
    
    public List<clnCadastroFuncionarios> consultaLista(){
        
        List<clnCadastroFuncionarios> lista = banco.selecionarLista();
        
        return lista;
    }
    
    public void consultaDetalhado(int cod){
        
        banco.selecionaDetalhado(cod);
        
    }
}
