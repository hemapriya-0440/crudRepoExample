package com.restwebservices.first.firstEx.Service;

import com.restwebservices.first.firstEx.Model.players;

public interface PlayerService {
public players createPlayer (players plyrs);

public Iterable<players> getAllplayers();
//public void deletebyId(long playerId);
}
