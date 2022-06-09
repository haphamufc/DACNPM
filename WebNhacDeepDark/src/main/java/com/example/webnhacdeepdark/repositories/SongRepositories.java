package com.example.webnhacdeepdark.repositories;

import com.example.webnhacdeepdark.entity.Author;
import com.example.webnhacdeepdark.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepositories extends JpaRepository<Song, Integer> {
    List<Song> findByAuthor(Author author);
    List<Song> findByNameContaining(String nameSong);
}
