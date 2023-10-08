import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        // Set Item Name
        item1.name = "Mocha";
        item2.name = "Latte";
        item3.name = "drip coffee";
        item4.name = "cappuccino";

        // Set Item Price
        item1.price = 1.00;
        item2.price = 2.50;
        item3.price = 4.00;
        item4.price = 3.50; 



        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // Set Order Name
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // Create ArrayLists to be able to add items into them
        order1.items = new ArrayList<Item>();
        order2.items = new ArrayList<Item>();
        order3.items = new ArrayList<Item>();
        order4.items = new ArrayList<Item>();


        // Print the order1 variable to the console to see what happens.
        System.out.println("\n"+ order1 + "\n"); // => Order@7a81197d

        // Predict what will happen if you print 'order1.total'.
        System.out.println("Order 1 Total: "+ order1.total + "\n");  // => Total: 0.0


        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
        // ORDER 2 DETAILS: 
        System.out.println("\n=========== ORDER 2 DETAILS ===========");
        System.out.println("\nName : " + order2.name);
        for(int i=0; i < order2.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + order2.items.get(i).name + " - " + " $" +order2.items.get(i).price);
        }
        System.out.println("Total Price: " + "$" +  order2.total);
        System.out.println("Ready ? : "+ order2.ready + "\n");
        
        
        //Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item2);
        order3.total += item2.price;
        // ORDER 3 DETAILS: 
        System.out.println("\n=========== ORDER 3 DETAILS ===========");
        System.out.println("\nName : " + order3.name);
        for(int i=0; i < order3.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + order3.items.get(i).name + " - " + " $" +order3.items.get(i).price);
        }
        System.out.println("Total Price: " + "$" +  order3.total);
        System.out.println("Ready ? : "+ order3.ready + "\n");
        
        
        //Sam added a latte. Update the order accordingly.
        order4.items.add(item3);
        order4.total += item3.price;
        // ORDER 4 DETAILS: 
        System.out.println("\n=========== ORDER 4 DETAILS ===========");
        System.out.println("\nName : " + order4.name);
        for(int i=0; i < order4.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + order4.items.get(i).name + " - " + " $" +order4.items.get(i).price);
        }
        System.out.println("Total Price: " + "$" +  order4.total);
        System.out.println("Ready ? : "+ order4.ready + "\n");
        
        
        
        //Cindhuri’s order is now ready. Update her status.
        order1.ready = true;
        // ORDER 1 DETAILS: 
        System.out.println("\n=========== ORDER 1 DETAILS ===========");
        System.out.println("\nName : " + order1.name);
        for(int i=0; i < order1.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + order1.items.get(i).name + " - " + " $" +order1.items.get(i).price);
        }
        System.out.println("Total Price: " + "$" +  order1.total);
        System.out.println("Ready ? : "+ order1.ready + "\n");



        //Sam ordered more drinks - 2 lattes. Update their order as well.
         order4.items.add(item3);
         order4.total += item3.price;
         order4.items.add(item2);
         order4.total += item2.price;
         order4.items.add(item2);
         order4.total += item2.price;
         order4.ready = true;
        // ORDER 4 DETAILS: 
        System.out.println("\n=========== ORDER 4 DETAILS ===========");
        System.out.println("\nName : " + order4.name);
        for(int i=0; i < order4.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + order4.items.get(i).name + " - " + " $" +order4.items.get(i).price);
        }
        System.out.println("Total Price: " + "$" +  order4.total);
        System.out.println("Ready ? : "+ order4.ready + "\n");



        //Jimmy’s order is now ready. Update his status.
        order2.ready = true;
        // ORDER 2 DETAILS: 
        System.out.println("\n=========== ORDER 2 DETAILS ===========");
        System.out.println("\nName : " + order2.name);
        for(int i=0; i < order2.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + order2.items.get(i).name + " - " + " $" +order2.items.get(i).price);
        }
        System.out.println("Total Price: " + "$" +  order2.total);
        System.out.println("Ready ? : "+ order2.ready + "\n");


    }
}
