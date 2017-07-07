
package com.dev.devfood.dao;



import com.devs.devfood.classesobjetos.clnCadastroPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class pedidoControle {
    
/* CREATE TABLE PEDIDO(
LANCHE VARCHAR(255),
QUANTIDADEL INT,
BEBIDAS  VARCHAR(255),
QUANTIDADEB INT,
MESA  INT
);   

*/
    public void insert(clnCadastroPedido pedido) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "insert into PEDIDO (MESA,LANCHE,QUANTIDADEL,BEBIDAS,QUANTIDADEB) values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pedido.getMesa());
            ps.setString(2, pedido.getLanche());
            ps.setString(1, pedido.getQuant1()); 
            ps.setString(1, pedido.getBebida());
            ps.setString(1, pedido.getQuant2());
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

public void delete(clnCadastroPedido pedido) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "delete from PEDIDO where MESA = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pedido.getMesa());
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

    public List<clnCadastroPedido> selecionarLista() {
        List<clnCadastroPedido> lista = new ArrayList<clnCadastroPedido>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "select MESA, LANCHE from PEDIDO";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String nomeCompleto = rs.getString(2);
                clnCadastroPedido p = new clnCadastroPedido();
                p.setMesa(sql);
                p.setLanche(nomeCompleto);
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

    public clnCadastroPedido selecionaDetalhado(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conexao.getConnection();
            String sql = "select MESA, NOME from PEDIDO where MESA = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Integer cod = rs.getInt(1);
                String nome = rs.getString(2);
                clnCadastroPedido p = new clnCadastroPedido();
                p.setMesa(nome);
                p.setLanche(nome);
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
