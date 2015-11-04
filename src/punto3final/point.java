package punto3final;

    // El Punto de definición de clase 
public class point {
    
       // variables miembro privadas 
   private int x, y;    // (x, y) las coordenadas
 
   // Constructores
   public point (int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   public point ()    {
       // por defecto (sin-arg) constructor
      x = 0;
      y = 0;
   }
 
   // GetVariables y setVariables para Publicar variables privadas
   public int getX () { 
      return x; 
   }
   
    public void setX(int x) { 
      this.x = x; 
   }
    
   public int getY () { 
      return y; 
   }
   
   public void setY (int y) { 
      this.y = y; 
   }
 
   // ToString () para describir en sí
   public String toString () { 
      return "(" + x + "," + y + ")"; 
   }
}
