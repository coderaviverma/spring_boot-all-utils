package com.example.demo.hibernates;

import com.example.demo.hibernates.inheritance.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DemoRepository extends JpaRepository<Department,Long> {




}
