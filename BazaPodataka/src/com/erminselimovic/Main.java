package com.erminselimovic;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        //Create Table
        DB.CreateDB();


        //INSERT
        DB person = new DB("Salih",54);
//        person.InsertNewPerson(person.getIme(), person.getAge());

        //UPDATE
        //person.UpdatePerson(person.getIme(),50);

        //SELECT
        person.SellectAllFromDB();


        //DELETE
        person.DeleteWhereId(4);
        System.out.println();
        person.SellectAllFromDB();

    }
}