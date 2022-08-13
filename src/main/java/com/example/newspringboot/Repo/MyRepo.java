package com.example.newspringboot.Repo;

import com.example.newspringboot.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<Employ, Integer> {
}
