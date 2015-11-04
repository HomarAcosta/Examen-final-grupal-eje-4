package punto3final;
public class Punto3Final {
    public static void main(String[] args) {
       
        // Un programa piloto de pruebas para la clase Línea 

      Line l1 = new Line (0, 3, 4, 0); 
      System.out.println (l1);   // toString () 
      System.out.println (l1.getLength ()); 
      l1.setComenzarXY (1, 2); 
      l1.setTerminarXY (3, 4); 
      System.out.println (l1); 
 
       point P1 = new point ( 3, 0); 
      point P2 = new point (0, 4); 
      Line L2 = new Line (P1, P2); 
      System.out.println (L2); 
      System.out.println (L2.getLength ()); 
      L2 .setComenzar (new point (5, 6)); 
      L2.setTerminar (new point (7, 8)); 
      System.out.println 
   
(L2);}}