package com.example.demo.repo;

import com.example.demo.Model.tableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testrepo extends JpaRepository<tableEntity,Long> {

}
