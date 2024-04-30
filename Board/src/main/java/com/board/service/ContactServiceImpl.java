package com.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.domain.ContactDTO;
import com.board.mapper.ContactMapper;

@Service
public class ContactServiceImpl implements ContactService
{
	@Autowired
	private ContactMapper contactMapper;
	
	@Override
	public boolean registerContact(ContactDTO params)
	{
		int queryResult = 0;
		
		if (params.getIdx() == null)
			queryResult = contactMapper.insertContact(params);
		
		return (queryResult == 1) ? true : false;
	}
}