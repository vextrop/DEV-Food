/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.devfood.dao;

import com.devs.devfood.classesobjetos.clnCadastroFuncionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class funcionarioControle {

    /*
CREATE TABLE FUNCIONARIO(
ID_FUNCIONARIO INT PRIMARY KEY,
NOMEF VARCHAR(255),
CPF INT,
RG INT,
DATA_NASC VARCHAR(255),
SEXO VARCHAR(255),
ENDERECO VARCHAR(255),
UF VARCHAR(255),
BAIRRO VARCHAR(255),
CIDADE VARCHAR(255),
CARGO VARCHAR(255),
HORASSEMANA VARCHAR(255),
VALORCOMISAO VARCHAR(255),
SALARIOB VARCHAR(255),
DATACONTRATA VARCHAR(255),
DATAENCE VARCHAR(255)
);
    */
    
public void insert(clnCadastroFuncionarios funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "insert into FUNCIONARIO (ID_FUNCIONARIO,NOMEF,CPF,RG,DATA_NASC,SEXO,ENDERECO,UF,BAIRRO,CIDADE,CARGO,HORASSEMANA,VALORCOMISAO,SALARIOB,DATACONTRATA,DATAENCE) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            String sql = "delete from FUNCIONARIO where ID_FUNCIONARIO = ?";
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

    public List<clnCadastroFuncionarios> selecionarLista() {
        List<clnCadastroFuncionarios> lista = new ArrayList<clnCadastroFuncionarios>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "select ID_FUNCIONARIO, NOMEF from FUNCIONARIO";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String nomeCompleto = rs.getString(2);
                clnCadastroFuncionarios p = new clnCadastroFuncionarios();
                p.setCodigo(codigo);
                p.setNomeCompleto(nomeCompleto);
                lista.add(p);
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
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
        return lista;
    }

    public List<clnCadastroFuncionarios> selecionaDetalhado(Integer codigo) {
        List<clnCadastroFuncionarios> lista = new ArrayList<clnCadastroFuncionarios>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "select ID_FUNCIONARIO, NOMEF from FUNCIONARIO where ID_FUNCIONARIO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Integer cod = rs.getInt(1);
                String nome = rs.getString(2);
                clnCadastroFuncionarios p = new clnCadastroFuncionarios();
                p.setCodigo(cod);
                p.setNomeCompleto(nome);
                lista.add(p);
                return lista;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
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
        return null;
    }
    
}
