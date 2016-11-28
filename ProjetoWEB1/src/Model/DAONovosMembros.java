
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAONovosMembros {
    private Connection con;
    
    //Construtor
    public DAONovosMembros() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void inseri(NovosMembros m) throws SQLException{
        //cria um praparedStatement
        String sql = "insert into membros" +
                " (nome_completo, cpf, rg, orgao_exp, curso, email, celular, "
                + "logradouro, numero, referencia, bairro, cidade, estado, aceito)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        //preenche os valores
//        stmt.setDouble(1, m.getId());
        stmt.setString(1, m.getNomeCompleto());
        stmt.setString(2, m.getCpf());
        stmt.setString(3, m.getRg());
        stmt.setString(4, m.getOrgaoExp());
        stmt.setString(5, m.getCurso());
        stmt.setString(6, m.getEmail());
        stmt.setString(7, m.getCelular());
        stmt.setString(8, m.getLogradouro());
        stmt.setInt(9, m.getNum());
        stmt.setString(10, m.getReferencia());
        stmt.setString(11, m.getBairro());
        stmt.setString(12, m.getCidade());
        stmt.setString(13, m.getEstado());
        stmt.setString(14, m.getAceito());
       
        stmt.execute();
        stmt.close();
        
        System.out.println("Gravado!!!");
        con.close();
    }
    
}
