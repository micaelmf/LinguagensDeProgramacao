
import Model.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Include {
    
    public static void main(String[] args) throws SQLException{
        //conectando
        Connection con = new ConnectionFactory().getConnection();
        if(con != null){
            System.out.println("Conexão: DEU CERTO =)");
        }else{
            System.out.println("Conexão: PRESTOU NÃO!!!");
        }
        
        //cria um praparedStatement
        String sql = "insert int membros" +
                " (id, nome_completo, cpf, rg, orgao_exp, curso, email, celular, "
                + "logradouro, numero, referencia, bairro, cidade, estado, aceito)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        //preenche os valores
        stmt.setString(1, "texto");
        stmt.setString(2, "texto");
        stmt.setString(3, "123");
        stmt.setString(4, "456");
        stmt.setString(5, "texto");
        stmt.setString(6, "texto");
        stmt.setString(7, "texto");
        stmt.setString(8, "texto");
        stmt.setString(9, "texto");
        stmt.setString(10, "789");
        stmt.setString(11, "texto");
        stmt.setString(12, "texto");
        stmt.setString(13, "texto");
        stmt.setString(14, "texto");
        stmt.setString(15, "texto");
        
        stmt.execute();
        stmt.close();
        
        System.out.println("Gravado!!!");
        con.close();
        
    }
    
}
