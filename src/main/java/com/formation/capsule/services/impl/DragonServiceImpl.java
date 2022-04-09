package com.formation.capsule.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.DragonAPIDAO;
import com.formation.capsule.dao.emtity.RecordEntity;
import com.formation.capsule.dao.emtity.ReponseDragonAPIEntity;
import com.formation.capsule.models.Dragon;
import com.formation.capsule.models.Thrusters;
import com.formation.capsule.services.DragonService;

@Service
public class DragonServiceImpl implements DragonService {
	
	@Autowired
	public DragonAPIDAO dragonAPIDAO;


	@Override
    public List<Dragon> getListeDragons(){
		
		ReponseDragonAPIEntity reponse = dragonAPIDAO.getListeDragons();
		return transformEntityToModel(reponse);
		
	}
	
	private List<Dragon> transformEntityToModel(ReponseDragonAPIEntity reponse) {
		List<Dragon> resultat = new ArrayList<Dragon>();
        for(RecordEntity record : reponse.getRecords()) {
        	
        	ArrayList<Thrusters> thrustersArrayList = new ArrayList<Thrusters>();
        	
        	for(Thrusters oneThruster : record.getThursters()) {
        		Thrusters thruster = new Thrusters();
        		thruster.setType(oneThruster.getType());
        		thruster.setAmount(oneThruster.getAmount());
        		thruster.setPods(oneThruster.getPods());
        		thruster.setFuel_1(oneThruster.getFuel_1());
        		thruster.setFuel_2(oneThruster.getFuel_2());
        		thruster.setIsp(oneThruster.getIsp());
        		thruster.setThrust_kN(oneThruster.getThrust_kN());
        		thruster.setThrust_lbf(oneThruster.getThrust_lbf());
        		thrustersArrayList.add(thruster);
        	}
        	
        	Dragon dragon = new Dragon();
        	dragon.setId(record.getId());
        	dragon.setName(record.getName());
        	dragon.setType(record.getType());
        	dragon.setActive(record.getActive());
        	dragon.setCrew_capacity(record.getCrew_capacity());
        	dragon.setSidewall_angle_deg(record.getSidewall_angle_deg());
        	dragon.setOrbit_duration_yr(record.getOrbit_duration_yr());
        	dragon.setDry_mass_kg(record.getDry_mass_kg());
        	dragon.setDry_mass_lb(record.getDry_mass_lb());
        	dragon.setFirst_flight(record.getFirst_flight());
        	dragon.setHeat_shields_material(record.getHeat_shields_material());
        	dragon.setHeat_shields_size_meters(record.getHeat_shields_size_meters());
        	dragon.setHeat_shields_temp_degrees(record.getHeat_shields_temp_degrees());
        	dragon.setHeat_shields_dev_partner(record.getHeat_shields_dev_partner());
        	dragon.setThursters(thrustersArrayList);
        	dragon.setLaunch_payload_mass_kg(record.getLaunch_payload_mass_kg());
        	dragon.setLaunch_payload_mass_lb(record.getLaunch_payload_mass_lb());
        	dragon.setLaunch_payload_vol_cubic_meters(record.getLaunch_payload_vol_cubic_meters());
        	dragon.setLaunch_payload_vol_cubic_feet(record.getLaunch_payload_vol_cubic_feet());
        	dragon.setReturn_payload_mass_kg(record.getReturn_payload_mass_kg());
        	dragon.setReturn_payload_mass_lb(record.getReturn_payload_mass_lb());
        	dragon.setReturn_payload_vol_cubic_meters(record.getReturn_payload_vol_cubic_meters());
        	dragon.setReturn_payload_vol_cubic_feet(record.getReturn_payload_vol_cubic_feet());
        	dragon.setPressurized_capsule_payload_volume_cubic_meters(record.getPressurized_capsule_payload_volume_cubic_meters());
        	dragon.setPressurized_capsule_payload_volume_cubic_feet(record.getPressurized_capsule_payload_volume_cubic_feet());
        	dragon.setTrunk_trunk_volume_cubic_meters(record.getTrunk_trunk_volume_cubic_meters());
        	dragon.setTrunk_trunk_volume_cubic_feet(record.getTrunk_trunk_volume_cubic_feet());
        	dragon.setTrunk_cargo_solar_array(record.getTrunk_cargo_solar_array());
        	dragon.setTrunk_cargo_unpressurized_cargo(record.getTrunk_cargo_unpressurized_cargo());
        	dragon.setHeight_w_trunk_meters(record.getHeight_w_trunk_meters());
        	dragon.setHeight_w_trunk_feet(record.getHeight_w_trunk_feet());
        	dragon.setDiameter_meters(record.getDiameter_meters());
        	dragon.setDiameter_feet(record.getDiameter_feet());
        	dragon.setFlickr_images(record.getFlickr_images());
        	dragon.setWikipedia(record.getWikipedia());
        	dragon.setDescription(record.getDescription());
        	
        	resultat.add(dragon);
        }
		return resultat;
	}

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


}
