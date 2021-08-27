public class Store {
    
    String storeName;
    String productType;
    int productInventory;
  // Metodo
  public Store(String name, String product, int inventory) {
    
    
    storeName = name;
    productType = product;
    productInventory = inventory;
  }
  
  // Metodo main donde creamos las instancias
  public static void main(String[] args) {
    
    System.out.println("Primero sucede esto");
    
    // Creamos una instancia
    Store lemonadeStand = new Store("Lemonchelo","Limonada", 50);
    // Mostramos por consola la instancia
    System.out.println("En el store "+lemonadeStand.storeName+" se vende "+lemonadeStand.productType+ " y actualmente cuenta con un inventario de: "+lemonadeStand.productInventory+ " piezas!");
    
    Store cookieShop = new Store("Galletalandia", "Galletitas", 12000);
    System.out.println("En el store "+cookieShop.storeName+" se vende "+cookieShop.productType+ " y actualmente cuenta con un inventario de: "+cookieShop.productInventory+ " piezas!");
    
    Store mercadolibre = new Store("Mercadolibre", "Servicios Digitales", 20402304);
      System.out.println("En el store "+mercadolibre.storeName+ " Se ofrecen "+mercadolibre.productType+ " aproximadamente unos "+mercadolibre.productInventory+ " productos");
    Store grind = new Store("Grind","Ropa", 250);
    System.out.println("En el store "+grind.storeName+ " Se vende "+grind.productType + " y actualmente cuenta con un inventario de: "+grind.productInventory+ " piezas!");
  }
}