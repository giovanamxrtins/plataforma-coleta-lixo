package data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnderecoDao {
    Connection con;
    PreparedStatement st;
    ResultSet rs;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", "");
            return true;  
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        } 
    } 
    
    public int enviar(Endereco endereco){
        int status;
        try {
            st = con.prepareStatement("INSERT INTO endereço VALUES(?, ?, ?, ?)");
            st.setString(1, endereco.getBairro());
            st.setString(2, endereco.getRua());
            st.setDouble(3, endereco.getN());
            st.setString(4, endereco.getRef());           
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            return ex.getErrorCode();
        }
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }  
    
    public Endereco consultar (String bairro){
        try {
        Endereco endereco = new Endereco();
        st = con.prepareStatement("SELECT * FROM endereço where bairro = ?");
        st.setString(1, bairro);
        rs = st.executeQuery();
        if(rs.next()){
            endereco.setBairro(rs.getString("bairro")); 
            endereco.setRua(rs.getString("rua"));
            endereco.setN(rs.getDouble("n"));
            endereco.setRef(rs.getString("ref"));
            return endereco;
        } else {
            return null;
        }
      } catch (SQLException ex) {
          return null;
      }
    }
}