package com.joseph.mythymeleaf.repository;

import com.joseph.mythymeleaf.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
