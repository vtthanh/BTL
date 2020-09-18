package database;

import Application.Word;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//database https://www.sqlitetutorial.net/sqlite-java/

public class DBManager {
    private Connection connection = Database.getDatabase();

    public void addWord(Word word) {
        String sql = "INSERT INTO " + Database.TABLENAME + "("
                + Database.COLUME_WORD_TARGET + "," +
                Database.COLUME_WORD_EXPLAIN + ") VALUE(?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, word.getWord_target());
            pstmt.setString(2, word.getWord_explain());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getExplain(String target) {
        String sql = "SELECT " + Database.COLUME_WORD_EXPLAIN + " FROM " +
                Database.TABLENAME + " WHERE " + Database.COLUME_WORD_TARGET + " = ?";
        ResultSet rs = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, target);
            rs = pstmt.executeQuery();
            return rs.getString(Database.COLUME_WORD_EXPLAIN);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public List<Word> getAllWord() {
        String sql = "SELECT " + Database.COLUME_WORD_TARGET + ", " + Database.COLUME_WORD_EXPLAIN + " FROM " + Database.TABLENAME;
        ResultSet rs = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            Word tmp;
            List<Word> res = new ArrayList<>();
            do {
                tmp = new Word(rs.getString(Database.COLUME_WORD_TARGET),
                        rs.getString(Database.COLUME_WORD_EXPLAIN));
                res.add(tmp);
            } while (rs.next());
            return res;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateExplain(String target, String explain) {
        String sql = "UPDATE " + Database.TABLENAME + " SET " + Database.COLUME_WORD_EXPLAIN +
                " = ? " + "WHERE " + Database.COLUME_WORD_TARGET + " = ?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            // set the corresponding param
            pstmt.setString(1, explain);
            pstmt.setString(2, target);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void deleteWord(String tager){
        String sql = "DELETE FROM "+Database.TABLENAME+" WHERE "+ Database.COLUME_WORD_TARGET+" = ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql)
            pstmt.setString(1, tager);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
