package com.samirAtivacao.DAO;

import com.samirAtivacao.banco.ConexaoSQLite;
import com.samirAtivacao.modelo.InformacoesCessado;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOInformacoesCessado extends ConexaoSQLite {

    public boolean salvarInformacoesCessados  (InformacoesCessado informacoes) {
        conectar();
        String sql = "INSERT INTO informacoesCessado("
                +"especie, "
                +"dataDeInicio,"
                +"dataFinalBeneficio,"
                +"rmi,"
                +"nb)"
                +"VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, informacoes.getEspecie());
            preparedStatement.setString(2, informacoes.getDataDeinicio());
            preparedStatement.setString(3, informacoes.getDataFinalBeneficio());
            preparedStatement.setString(4, informacoes.getRmi());
            preparedStatement.setString(5, informacoes.getNb());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        desconectar();
        return true;
    }

    public boolean excluirUInfomacoesDosPrev() {
        conectar();
        PreparedStatement preparedStatment;
        String sql = "DELETE FROM informacoesCessado";
        preparedStatment = this.criarPreparedStatement(sql);
        try {
            preparedStatment.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        } finally {
            if (preparedStatment != null) {
                try {
                    preparedStatment.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
        }

        this.desconectar();
        return true;
    }

}
