package com.mappingdemo.mapping.repository;

import com.mappingdemo.mapping.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository <PersonEntity,Long> {
}
