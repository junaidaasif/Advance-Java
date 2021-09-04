package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.techment.dao.IDao;

@Service
public class DataBaseService {
	@Autowired
	IDao dao;
}

