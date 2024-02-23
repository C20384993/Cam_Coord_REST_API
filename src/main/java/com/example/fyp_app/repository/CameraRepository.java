package com.example.fyp_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fyp_app.entity.Camera;
import com.example.fyp_app.entity.Recording;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Integer>{

	List<Camera> findAllByUserid(int userid);

	
}