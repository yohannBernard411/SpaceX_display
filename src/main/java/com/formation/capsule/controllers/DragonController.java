package com.formation.capsule.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Dragon;
import com.formation.capsule.models.Thrusters;
import com.formation.capsule.services.DragonService;

@RestController
public class DragonController {
	
	@Autowired
	private DragonService dragonService;
	
	@RequestMapping(path= "/api/dragons", method=RequestMethod.GET)
	public List<Dragon> getListeDragons() {
		
		/*
		
		Thrusters thrustersTest = new Thrusters();
	    thrustersTest.setType("Draco");
	    thrustersTest.setAmount(18);
	    thrustersTest.setPods(4);
	    thrustersTest.setFuel_1("nitrogen tetroxide");
	    thrustersTest.setFuel_2("monomethylhydrazine");
	    thrustersTest.setIsp(300);
	    thrustersTest.setThrust_kN(0.4);
	    thrustersTest.setThrust_lbf(90);
	    
	    ArrayList<Thrusters> thrustersArray = new ArrayList<Thrusters>();
	    thrustersArray.add(thrustersTest);
	    
	    ArrayList<String> flickrArray = new ArrayList<String>();
	    flickrArray.add("https://i.imgur.com/9fWdwNv.jpg");
	    flickrArray.add("https://live.staticflickr.com/8578/16655995541_7817565ea9_k.jpg");
	    flickrArray.add("https://farm3.staticflickr.com/2815/32761844973_4b55b27d3c_b.jpg");
	    flickrArray.add("https://farm9.staticflickr.com/8618/16649075267_d18cbb4342_b.jpg");

		
		Dragon dragonTest = new Dragon();
		dragonTest.setId("Dragon1");
		dragonTest.setName("Dragon 1");
		dragonTest.setType("capsule");
		dragonTest.setActive(true);
		dragonTest.setCrew_capacity(0);
		dragonTest.setSidewall_angle_deg(15);
		dragonTest.setOrbit_duration_yr(2);
		dragonTest.setDry_mass_kg(4200);
		dragonTest.setDry_mass_lb(9300);
		dragonTest.setFirst_flight("2010-12-08");
		dragonTest.setHeat_shields_material("PICA-X");
		dragonTest.setHeat_shields_size_meters(3.6);
		dragonTest.setHeat_shields_temp_degrees(3000);
		dragonTest.setHeat_shields_dev_partner("NASA");
		dragonTest.setThursters(thrustersArray);
		dragonTest.setLaunch_payload_mass_kg(6000);
		dragonTest.setLaunch_payload_mass_lb(13228);
		dragonTest.setLaunch_payload_vol_cubic_meters(25);
		dragonTest.setLaunch_payload_vol_cubic_feet(883);
		dragonTest.setReturn_payload_mass_kg(3000);
		dragonTest.setReturn_payload_mass_lb(6614);
		dragonTest.setReturn_payload_vol_cubic_meters(11);
		dragonTest.setReturn_payload_vol_cubic_feet(388);
		dragonTest.setPressurized_capsule_payload_volume_cubic_meters(11);
		dragonTest.setPressurized_capsule_payload_volume_cubic_feet(288);
		dragonTest.setTrunk_trunk_volume_cubic_meters(14);
		dragonTest.setTrunk_trunk_volume_cubic_feet(494);
		dragonTest.setTrunk_cargo_solar_array(2);
		dragonTest.setTrunk_cargo_unpressurized_cargo(true);
		dragonTest.setHeight_w_trunk_meters(7.2);
		dragonTest.setHeight_w_trunk_feet(23.6);
		dragonTest.setDiameter_meters(3.7);
		dragonTest.setDiameter_feet(3.7);
		dragonTest.setFlickr_images(flickrArray);
		dragonTest.setWikipedia("https://en.wikipedia.org/wiki/SpaceX_Dragon");
		dragonTest.setDescription( "Dragon is a reusable spacecraft developed by SpaceX, an American private space transportation company based in Hawthorne, California. Dragon is launched into space by the SpaceX Falcon 9 two-stage-to-orbit launch vehicle. The Dragon spacecraft was originally designed for human travel, but so far has only been used to deliver cargo to the International Space Station (ISS).");

		ArrayList<Dragon> dragonArray = new ArrayList<Dragon>();
		dragonArray.add(dragonTest);
		
		return dragonArray;
		
		*/
		
		return dragonService.getListeDragons();

	}
	
}
