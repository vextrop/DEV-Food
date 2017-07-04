/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.devfood.dao;

import com.devs.devfood.classesobjetos.clnCadastroFuncionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author eduardo
 */
public class funcionarioControle {

    /*
        codigo
        nome completo
        cpf
        rg
        data nasc   
        sexo
        endereco
        uf
        bairro
        cidade
        cargo
        horas semanai
        valor comissao
        salario base
        data contrat
        data enceramneto
    */
    
public void insert(clnCadastroFuncionarios funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "insert into produtos (COD_FUNCIONARIO,NOME_COMPLETO,CPF,RG,DATA_NASC,SEXO,ENDERECO,UF,BAIRRO,CIDADE,CARGO,HORAS_SEMANAIS,VALOR_COMISSAO,VALOR_SALARIO_BASE,DATA_CONTRATACAO,DATA_ENCERAMENTO) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getCodigo());
            ps.setString(2, funcionario.getNomeCompleto());
            ps.setString(3, funcionario.getCpf());
            ps.setInt(4, funcionario.getRg());
            ps.setString(5, funcionario.getDataNascimento());
            ps.setString(6, funcionario.getSexo());
            ps.setString(7, funcionario.getEndereco());
            ps.setString(8, funcionario.getUf());
            ps.setString(9, funcionario.getBairro());
            ps.setString(10, funcionario.getCidade());
            ps.setString(11, funcionario.getCargo());
            ps.setInt(12, funcionario.getHorasSemanais());
            ps.setFloat(13, funcionario.getValorComissao());//Ficar de olho neste float
            ps.setFloat(14, funcionario.getValorSalario());//Ficar de olho neste float
            ps.setString(15, funcionario.getDataContratacao());
            ps.setString(16, funcionario.getDataEnceramento());
            
            ps.execute();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

public void delete(clnCadastroFuncionarios funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "delete from PRODUTOS where CODIGO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getCodigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    

}
