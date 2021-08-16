package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Badges;

@Repository
public interface BadgesRepository extends JpaRepository<Badges, Integer>{

}
