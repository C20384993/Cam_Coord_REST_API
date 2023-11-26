package com.example.fyp_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fyp_app.entity.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Integer>{

}