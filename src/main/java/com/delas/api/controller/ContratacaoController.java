package com.delas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contratacao")
public class ContratacaoController {

    @Autowired
    private ContratacaoController contratacaoController;
}
