package org.example.dao;

import org.example.db.database;
import org.example.model.Hero;
import org.example.model.Squad;
import org.sql2o.Connection;

import java.util.List;

public class SquadDao {

    //CREATES THE SQUADS TABLE IN THE DATABASE UPON STARTING THE APP
    public static void getStarted (){

        try(Connection db = database.getConnect().open()){
            String createTable = "CREATE TABLE IF NOT EXISTS squads (squad varchar unique, cause varchar, size integer, deleted boolean default 'false');";
            db.createQuery(createTable).executeUpdate();
        } catch (Exception error) {System.out.println(error.getMessage());}
    }

    //GETS A LIST OF ALL THE SQUADS IN OUR DATABASE
    public static List<Squad> getAllSquads (){
        List<Squad> allSquads = null;
        try(Connection db = database.getConnect().open()){
            String squads = "SELECT * FROM squads WHERE deleted = (false);";
            allSquads = db.createQuery(squads).executeAndFetch(Squad.class);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return allSquads;
        }
        return allSquads;
    }

    //GETS A PARTICULAR SQUAD FROM THE SQUADS TABLE
    public static List<Squad> squadDetails (String squad) {
        List<Squad> squadDetailsList = null;
        try(Connection db = database.getConnect().open()){
            String squadDetailsQuery = "SELECT * FROM squads WHERE squad = (:squad);";
            squadDetailsList = db.createQuery(squadDetailsQuery).addParameter("squad", squad).executeAndFetch(Squad.class);
        } catch (Exception error) { System.out.println(error.getMessage());}
        return squadDetailsList;
    }

    //ADDS NEW SQUAD DETAILS TO THE DATABASE
    public static void addSquad(Squad newSquad) {
        try(Connection db = database.getConnect().open()){
            String squadAdd = "INSERT INTO squads (squad,cause, size) VALUES (:squad, :cause, :size);";
            db.createQuery(squadAdd).bind(newSquad).executeUpdate();
        } catch (Exception error) { System.out.println(error.getMessage());}
    }

    //RETURNS THE SET SQUAD SIZE FROM THE DATABASE
    public static Integer maxSize (String squad) {
        List<Squad> squadSize = null;
        try(Connection db = database.getConnect().open()){
            String sizeList = "SELECT size FROM squads WHERE squad = (:squad)"; //gets the size
            squadSize = db.createQuery(sizeList).addParameter("squad", squad).executeAndFetch(Squad.class);
        } catch (Exception error) { System.out.println(error.getMessage());}
        return squadSize.get(0).getSize();
    }

    //DELETES A SQUAD FROM THE DATABASE
    public static void deleteSquad(String name){
        try(Connection db = database.getConnect().open()){
            String deletedSquad = " UPDATE squads SET deleted = (true) WHERE squad = (:squad);";
            db.createQuery(deletedSquad).addParameter("squad", name).executeUpdate();
            HeroDao.resignSquad(name);
        } catch (Exception error) { System.out.println(error.getMessage());}
    }

}

