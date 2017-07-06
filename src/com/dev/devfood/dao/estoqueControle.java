
package com.dev.devfood.dao;

import com.devs.devfood.classesobjetos.clnCadastroEstoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class estoqueControle {
    
/*
    
CREATE TABLE ESTOQUE(
ID_ESTOQUE INT PRIMARY KEY,
NOMEP VARCHAR(255),
QUANTIDADEP INT,
VALIDADE VARCHAR(255),
FORNECEDOR VARCHAR(255),
CATEGORIA VARCHAR(255),
CUSTO VARCHAR(255),
OBSERVACOES VARCHAR(255)
);
    
    */    
    
public void insert(clnCadastroEstoque estoque) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "insert into ESTOQUE (ID_ESTOQUE,NOMEP,QUANTIDADEP,VALIDADE,FORNECEDOR,CATEGORIA,CUSTO,OBSERVACOES) values(?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, estoque.getCod());
            ps.setString(2, estoque.getnomeP());
            ps.setInt(3, estoque.getQuantidade());
            ps.setInt(4, estoque.getValidade());
            ps.setString(5, estoque.getFornecedor());
            ps.setString(6, estoque.getCategoria());
            ps.setFloat(7, estoque.getCusto());
            ps.setString(8, estoque.getObservacoes());
            
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

public void delete(clnCadastroEstoque estoque) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "delete from FUNCIONARIO where ID_FUNCIONARIO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, estoque.getCod());
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

    public List<clnCadastroEstoque> selecionarLista() {
        List<clnCadastroEstoque> lista = new ArrayList<clnCadastroEstoque>();
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
                clnCadastroEstoque p = new clnCadastroEstoque();
                p.setCod(codigo);
                p.setNomeP(nomeCompleto);
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

    public clnCadastroEstoque selecionaDetalhado(Integer codigo) {
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
                clnCadastroEstoque p = new clnCadastroEstoque();
                p.setCod(cod);
                p.setNomeP(nome);
                return p;
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

