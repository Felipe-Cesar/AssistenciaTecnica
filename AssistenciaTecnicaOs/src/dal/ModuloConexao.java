package dal;

import java.sql.*;

public class ModuloConexao {
    //Metodo responsavel por estabeler a conexao co o banco

    public static Connection conector() {

        java.sql.Connection conexao = null;
        //Chamar o driver  da biblioteca
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informaçoes referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfo";// caminho e nome do banco no lugar do localhosto pode por o ip do servidor em que o banco esta armazenado
        String user = "root";
        String password = "";

        //Estabelecendo a conexao com o banco
        //tenta se conectar com o banco de dados, caso nao consiga vai retornar null
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);//obtem a conexao usando a url, user e password e salta na variavel conexao
            return conexao;
        } catch (Exception e) {
            //System.out.println(e); // mostra qual é o erro
            return null;
        }

    }

}
