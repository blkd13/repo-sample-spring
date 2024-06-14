package com.example.app.server.repository;

import com.example.app.server.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a-tachihara
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
