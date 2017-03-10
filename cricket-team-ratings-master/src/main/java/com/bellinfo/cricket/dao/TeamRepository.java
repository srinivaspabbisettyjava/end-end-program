package com.bellinfo.cricket.dao;

import java.util.List;

import com.bellinfo.cricket.model.Team;

public interface TeamRepository {
	
	public void addTeam(Team team);
	public void updateTeam(Team team);
	public Team getTeam(int id);
	public void deleteTeam(int id);
	
	public List<Team> getTeams();

}
