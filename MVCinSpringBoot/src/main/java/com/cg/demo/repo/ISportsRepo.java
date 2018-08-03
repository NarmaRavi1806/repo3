package com.cg.demo.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.demo.bean.Day;


@Repository
public interface ISportsRepo extends JpaRepository<Day,Integer>{

	//public Day addDay(String day,List<Game> g);
	
	@Query(value="SELECT d FROM Day d where d.dayName=?1")
	public Day findByDayName(String name);
	
	@Query(value="SELECT d FROM Day d INNER JOIN d.game g WHERE g.gameName=:n")
	public List<Day> findByGameName( @Param(value="n") String gname);
}
