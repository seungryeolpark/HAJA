package com.example.HAJA.service.member;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.HAJA.model.member.dao.MessageDAO;
import com.example.HAJA.model.member.dto.MessageDTO;

@Transactional(readOnly=true)
@Service
public class MessageServiceImpl implements MessageService {

	@Inject
	MessageDAO messageDao;
	
	@Transactional
	@Override
	public void create(MessageDTO dto) throws Exception {
		messageDao.create(dto);
	}

	@Override
	public int countNview(String receive) throws Exception {
		return messageDao.countNview(receive);
	}

	@Transactional
	@Override
	public List<MessageDTO> list3(String receive) throws Exception {
		List<MessageDTO> list = messageDao.list3(receive);
		messageDao.yviewList3(receive);
		return list;
	}

	@Override
	public int count(String receive) throws Exception {
		return messageDao.count(receive);
	}

	@Transactional
	@Override
	public List<MessageDTO> listAll(String receive, int start, int end) throws Exception {
		messageDao.yviewListAll(receive, start, end);
		return messageDao.listAll(receive, start, end);
	}

	@Transactional
	@Override
	public void delete(int mno) throws Exception {
		messageDao.delete(mno);
	}

	@Override
	public String findReceive(int mno) throws Exception {
		return messageDao.findReceive(mno);
	}

}
