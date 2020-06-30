package com.restwebservices.first.firstEx.PlayerSeviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restwebservices.first.firstEx.Model.players;
import com.restwebservices.first.firstEx.Repository.PlayerRepository;
import com.restwebservices.first.firstEx.Service.PlayerService;
@Service
public class PlayerSeviceImpl implements PlayerService {
@Autowired 
private PlayerRepository repository;

	@Override
	public players createPlayer(players plyrs) {
		return repository.save(plyrs);
	}

	@Override
	public Iterable<players> getAllplayers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	/*
	 * @Override public void deletebyId(long playerId) { return
	 * repository.deleteById(playerId); }
	 */

	
}
