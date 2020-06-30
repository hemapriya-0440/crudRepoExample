package com.restwebservices.first.firstEx.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restwebservices.first.firstEx.Model.players;
@Repository
public interface PlayerRepository extends CrudRepository<players,Integer> {


}
