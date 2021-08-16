package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Employee, String>{

	@Query(value = "Select a.badge_id, a.badge_name, a.badge_cost, a.badge_dir, b.badges_count from badge a inner join (select * from mapping_table where email_id=:email_id) b on a.badge_id=b.badge_id order by badge_id asc;", nativeQuery = true)
    List< String > getProfile(@Param("email_id") String email_id);
	
	@Query(value = "Select a.badge_id, a.badge_name, a.badge_cost, a.badge_dir, ifnull(b.badges_count,0) as badges_count from badge a left outer join (select * from mapping_table where email_id=:email_id) b on a.badge_id=b.badge_id order by badge_id asc;", nativeQuery = true)
    List< String > getHome(@Param("email_id") String email_id);
	
//	@Query(value = "Select * mapping_table where email_id=:email_id;", nativeQuery = true)
//    List< String > getMappingTable(@Param("email_id") String email_id);
}
