package com.java.desingPatten;


	
	 class Chef {
		public void cookPasta() {
			System.out.println("Chef is cooking Chicken Alfredo…");
		}

		public void bakeCake() {
			System.out.println("Chef is baking Chocolate Fudge Cake…");
		}
	}
	
 class Order implements Command {
		private Chef chef;
		private String food;

		public Order(Chef chef, String food) {
			this.chef = chef;
			this.food = food;
		}

		@Override
		public void execute() {
			if (this.food.equals("Pasta")) {
				this.chef.cookPasta();
			} else {
				this.chef.bakeCake();
			}
		}
	}
	
	 class Waiter {
		private Order order;

		public Waiter(Order ord) {
			this.order = ord;
		}

		public void execute() {
			this.order.execute();
		}
	}
public class ClientBehavioraldesing {
	public static void main(String[] args) {
Chef chef = new Chef();
        
		Order order = new Order(chef, "Pasta");
		Waiter waiter = new Waiter(order);
		waiter.execute();

		order = new Order(chef, "Cake");
		waiter = new Waiter(order);
		waiter.execute();

	}

}
