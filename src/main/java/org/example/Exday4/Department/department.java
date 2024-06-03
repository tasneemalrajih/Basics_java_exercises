package org.example.Exday4.Department;

import java.sql.ResultSet;
import java.sql.SQLException;

public class department {
private int department_id;
private String department_name;
private int location_id;

    public department(int department_id, String department_name, int location_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.location_id = location_id;
    }
    public department(ResultSet rs) throws SQLException {
        department_id=rs.getInt("department_id");
        department_name =rs.getString("department_name");
        location_id=rs.getInt("location_id");


    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public int getLocation_id() {
        return location_id;
    }

    @Override
    public String toString() {
        return "department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", location_id=" + location_id +
                '}';
    }
}
