package com.example.webnhacdeepdark.repositories;

import com.example.webnhacdeepdark.entity.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SingerRepositories extends JpaRepository<Singer, Integer> {
    List<Singer> findByNameContaining(String name);

}
