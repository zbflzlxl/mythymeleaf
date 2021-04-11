package com.joseph.mythymeleaf.service;

import com.joseph.mythymeleaf.model.Board;
import com.joseph.mythymeleaf.model.User;
import com.joseph.mythymeleaf.repository.BoardRepository;
import com.joseph.mythymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
