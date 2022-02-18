package com.example.clickertest.repository;

import com.example.clickertest.model.Click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickerRepository extends JpaRepository<Click, Long> {

}
