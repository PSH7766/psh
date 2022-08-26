package com.example.psh_test.mapper;

import com.example.psh_test.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount();
    List<Board> getList();
    }
