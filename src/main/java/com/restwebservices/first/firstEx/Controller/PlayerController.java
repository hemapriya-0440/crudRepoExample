package com.restwebservices.first.firstEx.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restwebservices.first.firstEx.Model.players;
import com.restwebservices.first.firstEx.PlayerSeviceImpl.PlayerSeviceImpl;

@RestController
public class PlayerController {
@Autowired
private PlayerSeviceImpl inpl;
@RequestMapping(value="/players",method=RequestMethod.POST)
public players createPlayer(@RequestBody players plyrs) {
	return inpl.createPlayer(plyrs);
}
@RequestMapping(value="/players",method=RequestMethod.GET)
public Iterable<players> getall(){
	return inpl.getAllplayers();
}
/*
 * @RequestMapping(value="/players/{playerId}",method=RequestMethod.DELETE)
 * public String delete(@PathVariable long playerId) {
 * inpl.deletebyId(playerId); return "done"; }
 */
}
