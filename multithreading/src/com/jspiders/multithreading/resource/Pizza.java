package com.jspiders.multithreading.resource;

public class Pizza {
	private int availablePizza;
	public synchronized void orderPizza(int orderedPizza) {
		System.out.println("tring to order "+orderedPizza+" pizzas.");
		if(availablePizza<orderedPizza) {
			System.out.println(orderedPizza+" pizzas not available"+" please wait...!");
			try {
				this.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		availablePizza-=orderedPizza;
		System.out.println(orderedPizza+" Pizzas delivered");
		System.out.println(availablePizza+" Pizzas available");
	}
	public synchronized void bakePizza(int bakedPizza) {
		System.out.println("Baking"+bakedPizza+" Pizzas");
		availablePizza+=bakedPizza;
		System.out.println(bakedPizza+" pizzas backed");
		System.out.println(availablePizza+" pizzas available");
		this.notify();
	}
}

