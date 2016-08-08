package com.rajeevapp.ordermgm.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

@RestController
public class CartController {

	@Autowired DiscoveryClient discoveryClient;
	
	@PostConstruct
	public void init() {		
	}

	@RequestMapping("/cart/{productId}")
	public void viewCartProduct(@PathVariable Long productId) {	
		
	}

	@RequestMapping("/cart")
	public List<InstanceInfo> viewAllCartProducts() {
		System.out.println(discoveryClient.getInstancesById("ordermgm-catalog"));
		return discoveryClient.getInstancesById("ordermgm-catalog");
	}
}
