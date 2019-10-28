package model;
import javax.swing.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentCRUD {
    private Connection con;
    private int sid;
    private String sname;
    private String subject;

    DatabaseConnection dbc = new DatabaseConnection();

    String insertQuery = "insert into student (studentName, sub) values (?,?)";

    public StudentCRUD(){
        //sid = 0;
        sname = "";
        subject = "";
    }

    // insert method
    public void insertStudent(){

        con = dbc.getConnection();

        // inserting student into database
        try {
            Statement st = con.createStatement();
            PreparedStatement ps = con.prepareStatement(insertQuery);
            //ps.setInt(1sid);
            ps.setString(1,sname);
            ps.setString(2,subject);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"insert successfully");
        }catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e);
        }
    }

    // view method
    public String[][] fetchStudent(){
        con = dbc.getConnection();
        int row = 0;
        int rowIndex = 0;
        String[][] data = new String[row][3];

        // fetching student from database
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student order by studentid desc");

            if (rs.next()){
                rs.last();
                row = rs.getRow();
                rs.beforeFirst();
            }

            data = new String[row][3];

            while (rs.next()){
                data[rowIndex][0] = String.valueOf(rs.getInt(1));
                data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getString(3);
                rowIndex++;
            }
        }catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e);
        }
        return data;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
