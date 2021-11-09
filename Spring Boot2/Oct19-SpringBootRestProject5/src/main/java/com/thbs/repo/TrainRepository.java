package com.thbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thbs.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer>{

}
