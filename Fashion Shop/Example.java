import java.util.*;
class Example{
	public static void printInterface(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("    /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                             ");
			System.out.println("   | $$_____/                | $$      |__/                           /$$__  $$| $$                             ");
			System.out.println("   | $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$    ");
			System.out.println("   | $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$   ");
			System.out.println("   | $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$   ");
			System.out.println("   | $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$   ");
			System.out.println("   | $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/   ");
			System.out.println("   |__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/    ");
			System.out.println("                                                                                                   | $$            ");
			System.out.println("                                                                                                   | $$            ");
			System.out.println("                                                                                                   |__/            ");
			System.out.println();
			System.out.println("  ------------------------------------------------------------------------------------------------------------  ");
			System.out.println();
			System.out.println();
			System.out.println("           [1] Place Order                                            [2] Search Customer");
			System.out.println();
			System.out.println("           [3] Search Order                                           [4] View Reports");
			System.out.println();
			System.out.println("           [5] Change Order Status                                    [6] Delete Order");
			System.out.println();
			System.out.println();
			System.out.print("           Input Option : ");
			int option01=input.nextInt();
			switch(option01){
				case 1 : printPlaceOrder();break;
				case 2 : printSearchCustomer();break;
				case 3 : printSearchOrder();break;
				case 4 : printViewReports();break;
				case 5 : printChangeOrderStatus();break;
				case 5 : printDeleteOrder();break;
				default: return;
			}
		}while(true);
	}
	public static void printPlaceOrder(){
			System.out.println();
			System.out.println("       _____  _                   ____          _           ");
			System.out.println("      |  __ \\| |                 / __ \\        | |          ");
			System.out.println("      | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ ");
			System.out.println("      |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
			System.out.println("      | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   ");
			System.out.println("      |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   ");
			System.out.println();
			System.out.println("    ----------------------------------------------------------");
			System.out.println();
			System.out.println();
		Random input=new Random();
		for(int i=0; i<2; i++){
			System.out.println("      Enter Order ID : "+orderIds);
			System.out.println();
			printPhoneNumber();	
		}
	}
	public static void printPhoneNumber(){
		Scanner input=new Scanner(System.in);
			System.out.print("      Enter Customer Phone Number : ");
			int phoneNumber=input.nextInt();
			int count=0;
			int rev = 0;
			do{
				rev*=10;
				rev+=(phoneNumber%10);
			}while((phoneNumber/=10)!=0);
			while(phoneNumber!=0){
				phoneNumber/=10;
				count++;
			}
			if((count!=10)&&((rev%10)!=0)){
				System.out.println();
				printSize();
			}
			System.out.println("\n\t\tInvalid Phone number.. Try again");
			do{
				System.out.print("\n\tDo you want to place this order? (y/n) : ");
				char op=input.next().charAt(0);
				if(op=='y'|| op=='Y'){
					System.out.println("\n\t\tOrder Placed..!");
					
				}
				if(op=='n'|| op=='N'){
					System.out.print("\n\tDo you want to place another order? (y/n) : ");
						if(op=='y'|| op=='Y'){
							System.out.println("\n\t\tOrder Placed..!");
							continue;
						}
						do{
							System.out.print("\n\tDo you want to place another order? (y/n) : ");
							printInterface();
						}while(op=='n'|| op=='N');
				}
			}while(true);
	}
	public static void printSize(){
		Scanner input=new Scanner(System.in);
			String size1="XS";
			String size2="S";
			String size3="M";
			String size4="L";
			String size5="XL";
			String size6="XXL";
			System.out.print("      Enter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
			String size=input.next();
			System.out.println();
			System.out.print("      Enter QTY : ");
			int qty=input.nextInt();
			System.out.println();
			if(size==size1){
				System.out.print("      Amount : "+(qty*600)+".00");
			}else if(size==size2){
				System.out.print("      Amount : "+(qty*800)+".00");
			}else if(size==size3){
				System.out.print("      Amount : "+(qty*900)+".00");
			}else if(size==size4){
				System.out.print("      Amount : "+(qty*1000)+".00");
			}else if(size==size5){
				System.out.print("      Amount : "+(qty*1100)+".00");
			}else{
				System.out.print("      Amount : "+(qty*1200)+".00");
			}
	}
	public static void printSearchCustomer(){
			System.out.println();
			System.out.println("         _____                     _        _____          _                               ");
			System.out.println("        / ____|                   | |      / ____|        | |                              ");
			System.out.println("       | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __    ");
			System.out.println("        \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|   ");
			System.out.println("        ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |      ");
			System.out.println("       |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|      ");
			System.out.println();
			System.out.println("     ------------------------------------------------------------------------------------- ");
			System.out.println();
			System.out.println();
			System.out.println();
			L1:do{
			System.out.print("      Enter Customer Phone Number : ");
			int pNumber1=input.nextInt();
			if(pNumber1!=0){
				System.out.print("      Invalid input..");
				System.out.print("\n\nEnter Do you want to search another customer report? (y/n) : ");
				if(op=='n'|| op=='N'){
					System.out.println("\t\t+----------+---------+--------------+");
					System.out.printf("\t\t%-7s|%-7s||%-15s|%n","  Size","   QTY"," Amount");
					System.out.println("\t\t+----------+---------+--------------+");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t| M        |      6  |      "+(6*900)+".00  |");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t| XL       |      4  |      "+(4*1100)+".00  |");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t| XXL      |      1  |      "+(1*1200)+".00  |");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t| XS       |      0  |      "+(0*600)+".00  |");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t| S        |      0  |      "+(0*800)+".00  |");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t| L        |      0  |      "+(0*1000)+".00  |");
					System.out.print("\t\t|          |         |              |");
					System.out.print("\t\t+----------+---------+--------------+");
					System.out.print("\t\t| Total Amount       |      "+(6*900)+(4*1100)+(1*1200)+(0*600)+(0*800)+(0*1000)+"  |");
					System.out.print("\t\t+--------------------+--------------+");
				System.out.print("\n\nEnter Do you want to search another customer report? (y/n) : ");
				if(op=='y'|| op=='Y'){
					continue L1;
				}
				if(op=='y'|| op=='Y'){
					printInterface();
				}
											
						if(op=='y'|| op=='Y'){
							return L1;
						}
			}
			}while(true);
		}
	}
	public static void printSearchOrder(){
			System.out.println();
			System.out.println("         _____                     _        ____          _             ");
			System.out.println("        / ____|                   | |      / __ \\        | |            ");
			System.out.println("       | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __   ");
			System.out.println("        \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|  ");
			System.out.println("        ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |     ");
			System.out.println("       |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|     ");
			System.out.println();
			System.out.println("     -------------------------------------------------------------------");
			System.out.println();
			System.out.println();
	}
	public static void printViewReports(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("        _____                       _         "); 
			System.out.println("       |  __ \\                     | |        "); 
			System.out.println("       | |__) |___ _ __   ___  _ __| |_ ___   ");
			System.out.println("       |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|  ");
			System.out.println("       | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\  ");
			System.out.println("       |_|  \\_\\___| .__/ \\___/|_|   \\__|___/  ");
			System.out.println("                  | |                         ");
			System.out.println("                  |_|                         ");
			System.out.println();
			System.out.println("     -----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("              [1] Customer Reports");
			System.out.println();
			System.out.println("              [2] Item Reports");
			System.out.println();
			System.out.println("              [3] Orders Reports");
			System.out.println();
			System.out.println();
			System.out.print("           Enter Option : ");
			int option02=input.nextInt();
			switch(option02){
				case 1 : printCustomerReports();break;
				case 2 : printItemReports();break;
				case 3 : printOrderReports();break;
			}
		}while(true);	
	}
	public static void printCustomerReports(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("         _____          _                              _____                       _         ");
			System.out.println("        / ____|        | |                            |  __ \\                     | |        ");
			System.out.println("       | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___   ");
			System.out.println("       | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|  ");
			System.out.println("       | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\  ");
			System.out.println("        \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/  ");
			System.out.println("                                                                 | |                         ");
			System.out.println("                                                                 |_|                         ");
			System.out.println();
			System.out.println("     ----------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("              [1] Best in Customers");
			System.out.println();
			System.out.println("              [2] View Customers");
			System.out.println();
			System.out.println("              [3] All Customer Report");
			System.out.println();
			System.out.println();
			System.out.print("           Enter Option : ");
			int option03=input.nextInt();
			switch(option03){
				case 1 : printBestInCustomers();break;
				case 2 : printViewCustomers();break;
				case 3 : printAllCustomerReports();break;
			}
		}while(true);	
	}
	public static void printBestInCustomers(){
			System.out.println();
			System.out.println("        ____            _     _____          _____          _                                  ");
			System.out.println("       |  _ \\          | |   |_   _|        / ____|        | |                                 ");
			System.out.println("       | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___   ");
			System.out.println("       |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|  ");
			System.out.println("       | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\  ");
			System.out.println("       |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/  ");
			System.out.println();
			System.out.println("     ------------------------------------------------------------------------------------------");
			System.out.println();
	}
	public static void printViewCustomers(){
			System.out.println();
			System.out.println("       __      ___                  _____          _                                  ");
			System.out.println("       \\ \\    / (_)                / ____|        | |                                 ");
			System.out.println("        \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___   ");
			System.out.println("         \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|  ");
			System.out.println("          \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\  ");
			System.out.println("           \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/  ");
			System.out.println();
			System.out.println("     ---------------------------------------------------------------------------------");
			System.out.println();
	}

	public static void printItemReports(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("        _____ _                   _____                       _         ");
			System.out.println("       |_   _| |                 |  __ \\                     | |        ");
			System.out.println("         | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___   ");
			System.out.println("         | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|  ");
			System.out.println("        _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\  ");
			System.out.println("       |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/  ");
			System.out.println("                                            | |                         ");
			System.out.println("                                            |_|                         ");
			System.out.println();
			System.out.println("     -------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("              [1] Best Selling Categories Sorted by QTY");
			System.out.println();
			System.out.println("              [2] Best Selling Categories Sorted by Amount");
			System.out.println();
			System.out.println();
			System.out.print("           Enter Option : ");
			int option04=input.nextInt();
			switch(option04){
				case 1 : printSortedByQTY();break;
				case 2 : printSortedByAmount();break;
			}
		}while(true);
	}
	public static void printSortedByQTY(){
			System.out.println();
			System.out.println("         _____            _           _   ____           ____ _________     __  ");
			System.out.println("        / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /  ");
			System.out.println("       | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ /   ");
			System.out.println("        \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /    ");
			System.out.println("        ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |     ");
			System.out.println("       |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|     ");
			System.out.println("                                                 __/ |                          ");
			System.out.println("                                                |___/                           ");
			System.out.println();
			System.out.println("     ---------------------------------------------------------------------------");
			System.out.println();
	}
	public static void printSortedByAmount(){
			System.out.println();
			System.out.println("         _____            _           _   ____                                               _     ");
			System.out.println("        / ____|          | |         | | |  _ \\            /\\                               | |    ");
			System.out.println("       | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_   ");
			System.out.println("        \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|  ");
			System.out.println("        ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_   ");
			System.out.println("       |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|  ");
			System.out.println("                                                 __/ |                                             ");
			System.out.println("                                                |___/                                              ");
			System.out.println();
			System.out.println("     ----------------------------------------------------------------------------------------------");
			System.out.println();
	}
	public static void printOrderReports(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("         ____          _             _____                       _         ");
			System.out.println("        / __ \\        | |           |  __ \\                     | |        ");
			System.out.println("       | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___   ");
			System.out.println("       | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|  ");
			System.out.println("       | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\  ");
			System.out.println("        \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/  ");
			System.out.println("                                               | |                         ");
			System.out.println("                                               |_|                         ");
			System.out.println();
			System.out.println("     ----------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("              [1] All Orders");
			System.out.println();
			System.out.println("              [2] Orders By Amount");
			System.out.println();
			System.out.println();
			System.out.print("           Enter Option : ");
			int option05=input.nextInt();
			switch(option05){
				case 1 : printAllOrders();break;
				case 2 : printOrderByAmount();break;
			}
		}while(true);
	}
	public static void printAllOrders(){
			System.out.println();
			System.out.println("                   __      ___                  ____          _                 ");
			System.out.println("                   \\ \\    / (_)                / __ \\        | |                ");
			System.out.println("                    \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___   ");
			System.out.println("                     \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|  ");
			System.out.println("                      \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\  ");
			System.out.println("                       \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/  ");
			System.out.println();
			System.out.println("                 ---------------------------------------------------------------");
			System.out.println();
			System.out.println();
	}
	public static void printOrderByAmount(){
			System.out.println();
			System.out.println("         ____          _                 ____                                               _     ");
			System.out.println("        / __ \\        | |               |  _ \\            /\\                               | |    ");
			System.out.println("       | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_   ");
			System.out.println("       | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|  ");
			System.out.println("       | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_   ");
			System.out.println("        \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|  ");
			System.out.println("                                                __/ |                                             ");
			System.out.println("                                               |___/                                              ");
			System.out.println();
			System.out.println("     ---------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
	}
	public static void printChangeOrderStatus(){
			System.out.println();
			System.out.println("         ____          _              _____ _        _               ");
			System.out.println("        / __ \\        | |            / ____| |      | |              ");
			System.out.println("       | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___   ");
			System.out.println("       | |  | | '__/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|  ");
			System.out.println("       | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\  ");
			System.out.println("        \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/  ");
			System.out.println();
			System.out.println("     ----------------------------------------------------------------");
			System.out.println();
			System.out.println();
	}
	public static void printDeleteOrder(){
			System.out.println();
			System.out.println("        _____       _      _          ____          _             ");
			System.out.println("       |  __ \\     | |    | |        / __ \\        | |            ");
			System.out.println("       | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __   ");
			System.out.println("       | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|  ");
			System.out.println("       | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |     ");
			System.out.println("       |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|     ");
			System.out.println();
			System.out.println("     -------------------------------------------------------------");
			System.out.println();
			System.out.println();
	}
	public final static void clearConsole(){
		try{
			final String os = System.getProperty("os.name");
			if(os.contains("Windows")){
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}else{
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch (final Exception e){
			e.printStackTrace();
			// Handle any exceptions.
		}
	}
	public static String[] orderIds = {"ODR#00001","ODR#00002","ODR#00003","ODR#00004","ODR#00005","ODR#00006","ODR#00007","ODR#00008"};// order IDs
	public static String[] customerIds = {"0776198410","0703859852","0769854321","0776198410","0703859852","0775544336","0703859852","0712002200"};// phone numbers as customer IDs
	public static String[] sizes = {"XS","XL","XXL","M","M","S","XXL","M"};// Sizes XS S M L XL XXL
	public static int[] qtys = {3,4,1,3,6,2,1,3};// order quantities
	public static String[] status = {"processing","delivering","delivered","delivering","processing","delivered","processing","delivered"};// order status -> processing / delivering / delivered
	
	public static final double xs = 600.00;
	public static final double s = 800.00;
	public static final double m = 900.00;
	public static final double l = 1000.00;
	public static final double xl = 1100.00;
	public static final double xxl = 1200.00;
	
	public static String[] extendStringArray(String[] ar){
		String[] temp = new String[ar.length+1];
		
		for (int i = 0; i < ar.length; i++){
			temp[i] = ar[i];
		}
		
		return temp;
	}
	
	public static void printAllCustomerReports(){
			System.out.println();
			System.out.println("                 _ _    _____          _                              _____                       _     ");
			System.out.println("           /\\   | | |  / ____|        | |                            |  __ \\                     | |    ");
			System.out.println("          /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_   ");
			System.out.println("         / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __|  ");
			System.out.println("        / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_   ");
			System.out.println("       /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|  ");
			System.out.println("                                                                                | |                     ");
			System.out.println("                                                                                |_|                     ");
			System.out.println();
			System.out.println("     ---------------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
		String[] customers = new String[0];
		
		if (customerIds.length>0){
			L1:for (int i = 0; i < customerIds.length; i++){
				//boolean notAdded = true;
				for (int j = 0; j < customers.length; j++){
					if (customerIds[i].equals(customers[j])){
						//notAdded = false;
						continue L1;
					}
				}
				
				//System.out.println(Arrays.toString(extendStringArray(customers)));
				customers = extendStringArray(customers); //[0716985848,072387468,07348762374,08326547621,07645762324,null]
				customers[customers.length-1] = customerIds[i];
			}
			
		}
		
		//System.out.println(Arrays.toString(customers));
		
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%-15s|%n"," Phone Number","  XS","   S","   M","   L","  XL","  XXL"," Total Amount");
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		
		
		for (int i = 0; i < customers.length; i++){
			 int[] tempSizes = new int[6];
			 String[] size = {"XS","S","M","L","XL","XXL"};
			 
			 for (int j = 0; j < customerIds.length; j++){
				 if (customers[i].equals(customerIds[j])){
					 switch (sizes[j]){
						 case "XS": tempSizes[0] += qtys[j];break; //tempSizes[0] = tempSizes[0]+qtys[j]
						 case "S": tempSizes[1] += qtys[j];break; //tempSizes[1] = tempSizes[1]+qtys[j]
						 case "M": tempSizes[2] += qtys[j];break; //tempSizes[2] = tempSizes[2]+qtys[j]
						 case "L": tempSizes[3] += qtys[j];break; //tempSizes[3] = tempSizes[3]+qtys[j]
						 case "XL": tempSizes[4] += qtys[j];break; //tempSizes[4] = tempSizes[4]+qtys[j]
						 case "XXL": tempSizes[5] += qtys[j];break; //tempSizes[5] = tempSizes[5]+qtys[j] //CTRL+D
					 }
					 
				 }
			 }
			 
			 
			 double total = 0;
			 
			 /*total += tempSizes[0] * xs;
			 total += tempSizes[1] * s;
			 total += tempSizes[2] * m;
			 total += tempSizes[3] * l;
			 total += tempSizes[4] * xl;
			 total += tempSizes[5] * xxl;*/
			 
			 for (int j = 0; j < tempSizes.length; j++){
				 total += (double)tempSizes[j]*(size[j].equals("XS")? xs:size[j].equals("S")? s:size[j].equals("M")? m:size[j].equals("L")? l:size[j].equals("XL")? xl:xxl); 
			 }
			 
			 
			 
			 System.out.printf("\t\t|%15s|%7s|%7s|%7s|%7s|%7s|%7s|%15s|%n","","","","","","","","");
			 System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%13.2f  |%n",customers[i],"  "+tempSizes[0],"  "+tempSizes[1],"  "+tempSizes[2],"  "+tempSizes[3],"  "+tempSizes[4],"  "+tempSizes[5],total);
			 
		}
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		
	}
	public static void main(String []args){
		printInterface();
	}
}
