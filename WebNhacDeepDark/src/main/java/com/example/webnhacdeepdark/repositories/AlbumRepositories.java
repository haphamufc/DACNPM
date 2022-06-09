package com.example.webnhacdeepdark.repositories;

import com.example.webnhacdeepdark.entity.Album;
import com.example.webnhacdeepdark.entity.Author;
import com.example.webnhacdeepdark.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepositories extends JpaRepository<Album, Integer> {
<<<<<<< Updated upstream
    List<Album> findByNameContaining (String name);
=======
    List<Album> findByAuthor(Author author);

>>>>>>> Stashed changes
}
