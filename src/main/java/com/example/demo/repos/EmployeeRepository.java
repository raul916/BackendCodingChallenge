package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
//	@Modifying
//	@Query(value = "update emp set kudos_points = kudos_points - 10, kudos_spent = kudos_spent + 10 where email_id=/'a1@gmail.com'/", nativeQuery = true)
//    void updateKudos();
	
//	@Modifying
//	@Query(value="update emp u set u.kudos_spent = 100 where kudos_spent=0", nativeQuery = true)
//	int updateKudos();

}
