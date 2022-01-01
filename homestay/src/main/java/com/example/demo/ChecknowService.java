package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChecknowService {
	@Autowired
	CheckNowRepo cn;
	public void saveData(CheckNow ch)
	{
		cn.save(ch);
	}
}
