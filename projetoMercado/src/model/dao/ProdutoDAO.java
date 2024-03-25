package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.MercadinhoDTO;


public class ProdutoDAO {
    public List<MercadinhoDTO> readProdutos() {
        List<MercadinhoDTO> listaProduto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null; 
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT idProduto, nome, descricao, preco, estoque FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MercadinhoDTO produto = new MercadinhoDTO();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setEstoque(rs.getInt("estoque"));
                listaProduto.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaProduto;
    }
}
