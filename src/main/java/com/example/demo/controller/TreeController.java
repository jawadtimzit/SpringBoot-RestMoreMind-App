package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Treehouse;
import com.example.demo.repository.TreeRepository;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1")  // this is the standard we devolope typically we use for restful API
public class TreeController {
	
	@Autowired
	private TreeRepository treeRepository;
	
	//get all trees
	@GetMapping("/treehouses") // whenevr we enter in local host /api/vs/treehouses we will get the list of trees
	public List<Treehouse> getAllTreehouses(){
		return treeRepository.findAll();  // return the list of trees
	}
	
    @GetMapping("/searchTreehouses")
    public List<Treehouse> searchTreehouses()
    {
    	return treeRepository.findAll();
    }
    @GetMapping("/getPrices") // whenevr we enter in local host /api/vs/treehouses we will get the list of trees
	public List<Object> getTreehousePrices(){
		return treeRepository.getPrices();  // return the list of trees
	}
    
    @GetMapping("/getTreeHouseSizes")
    public List<Object> getTreeHouseSizes()
    {
    	return treeRepository.getSizes();   	
    }
	
    
    @GetMapping("/getTreeHouseById")
    public Optional<Treehouse> getTreeHouseById(@RequestParam Long Id)
    {
    	return treeRepository.findById(Id);   	
    }
    
    @GetMapping("/getFilteredTreeHouses")
    public List<Treehouse> getFilteredTreeHouses(@RequestParam int Size,@RequestParam int Price,@RequestParam String CityName)
    {
    	//System.out.println(Size+"  "+Price+"   "+CityName);
    	return treeRepository.getFilteredTreehouses(Size, Price, CityName);
    }
//	// get treehouses based on cities input
//	@GetMapping("/treehouses/{TreehouseID}")
//	
//	public List<Treehouse> getNames(@PathVariable("TreehouseID")int TreehouseID){
//		return treeRepository.findById(TreehouseID);
//    }
}
