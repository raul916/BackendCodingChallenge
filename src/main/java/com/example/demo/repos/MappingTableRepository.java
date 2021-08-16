package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;

@Repository
public interface MappingTableRepository extends JpaRepository<MappingTable, MapTableKey>
{	
	@Query(value = "Select * from mapping_table where email_id=:email_id ;", nativeQuery = true)
    List< String > getMappingTable(@Param("email_id") String email_id);
}
