package com.dest1.OrdemParanormal.Repositories;

import com.dest1.OrdemParanormal.entities.OrdemParanormal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpRepository extends JpaRepository<OrdemParanormal, Integer> {
}
