package pack1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

   public class Compras {
       public static void main(String[] args) throws IOException {
		
          Producto uno = new Producto("Yerba Mate 1kg",800.50,001);
          Producto dos = new Producto("Pan 1kg",350,002);
          Producto tres = new Producto("Dulce de frutilla",275.50,003);
          Pers c1 = new Pers("Frodo Bolsón");
          Carrito z = new Carrito(c1,9032);
		
	       ItemCarrito [] item = new ItemCarrito[3];
		   item[0] = new ItemCarrito(z,uno,2);
                   item[1] = new ItemCarrito(z,dos,2);
                   item[2] = new ItemCarrito(z,tres,1);		
		       mostrarCompra(item,z,c1);
   }	
       public static void mostrarCompra(ItemCarrito cargaItem[], Carrito z, Pers c1) {
	           
	       System.out.println("Ticket: "+z.Num());
	       System.out.println("Cliente/a: "+c1.Nombre());
	         for (ItemCarrito  items : cargaItem) {
	             items.mostrarItem();
	             z.sumarMonto(items);			
		}
	           System.out.println(" ");
		   System.out.println("Total: $"+z.MontoTotal());
            Descuento dFijo = new DescuentoFijo();
            dFijo.asignaMonto(800);
            System.out.println("\nCompra final con cupo de descuento: $"+dFijo.montoFinal(z.MontoTotal()));
            System.out.println("  ");
	    System.out.println("Gracias vuelva pronto");
   }
 }
