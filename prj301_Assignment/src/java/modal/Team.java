/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author duynh
 */
public class Team {
    private int teamid;
    private String teamname;
    private int possition;

    public int getPossition() {
        return possition;
    }

    public void setPossition(int possition) {
        this.possition = possition;
    }
    public Team() {
    }

    public Team(int teamid, String teamname) {
        this.teamid = teamid;
        this.teamname = teamname;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    
}
