/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.MercadinhoDTO;
/**
 *
 * @author Senai
 */
public class UsuarioDAO {
    public List<MercadinhoDTO> read() {
        List<MercadinhoDTO> usuarioList = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MercadinhoDTO usuario = new MercadinhoDTO();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuarioList.add(usuario);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarioList;
    }
    public void create(MercadinhoDTO login) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("INSERT INTO usuario (nome, login, senha, telefone, endereco) VALUES (?, ?, ? ,? ,?)");
            stmt.setString(1, login.getNome());
            stmt.setString(2, login.getLogin());
            stmt.setString(3, login.getSenha());
            stmt.setString(4, login.getTelefone());
            stmt.setString(5, login.getTelefone());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public Boolean login(String login, String senha) {
        Boolean validar = false;
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                validar = true;
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return validar;
    }
    public void delete(MercadinhoDTO usuario) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("DELETE FROM usuario WHERE idUsuario = ?");
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            
     } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void update(MercadinhoDTO editar) {
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
        
            stmt = conexao.prepareStatement("UPDATE usuario set nome = ?, senha = ?, telefone = ?, endereco = ? WHERE idusuario = ?");
            stmt.setString(1, editar.getNome());
            stmt.setString(2, editar.getSenha());
            stmt.setString(3, editar.getTelefone());
            stmt.setString(4, editar.getEndereco());
    
            ResultSet rs = stmt.executeQuery();
            
       
            rs.close();
            stmt.close();
            conexao.close();
            

           } catch (SQLException e){
            e.printStackTrace();
        }
    } 
}
