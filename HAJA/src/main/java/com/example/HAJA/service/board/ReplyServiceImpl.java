package com.example.HAJA.service.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.HAJA.model.board.dao.ReplyDAO;
import com.example.HAJA.model.board.dto.ReplyDTO;

@Transactional(readOnly=true)
@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	ReplyDAO replyDao;
	
	@Transactional
	@Override
	public void create(ReplyDTO dto) throws Exception {
		replyDao.create(dto);
	}

	@Override
	public List<ReplyDTO> listAll(int bno, int start, int end) throws Exception {
		return replyDao.list(bno, start, end);
	}

	@Override
	public int count(int bno) throws Exception {
		return replyDao.count(bno);
	}

	@Transactional
	@Override
	public void delete(int rno) throws Exception {
		replyDao.delete(rno);
	}

	@Override
	public String findId(int rno) throws Exception {
		return replyDao.findId(rno);
	}

	@Transactional
	@Override
	public void edit(ReplyDTO dto) throws Exception {
		replyDao.edit(dto);
	}

}
