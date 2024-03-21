package RuedaZureraMengualAntonio2324;

public class RuedaZureraMengualAntonio2324 {

    public static void main(String[] args) {
    
        Rueda rueda = new Rueda(40,2,50);

        viaje1_AZM(rueda);
        viaje2_AZM(rueda);
        viaje3_AZM(rueda);
        rellenar1_AZM(rueda);
        rellenar2_AZM(rueda);
    }
    
    private static void viaje1_AZM(Rueda rueda) {
        try{
            System.out.println("Intentando realizar un viaje de 80 kilómetros...");
            rueda.viaje(80); 
            System.out.println("Quedan: " + rueda.getCombustibleQueda() + " litros de combustible.");
        } catch(Exception e){
            System.out.println("Error al hacer el viaje: " + e.getMessage());
        }
    }
    
    private static void viaje2_AZM(Rueda rueda) {
        try{
            System.out.println("Intentando realizar un viaje de -80 kilómetros (debería fallar)...");
            rueda.viaje(-80); 
            System.out.println("Quedan: " + rueda.getCombustibleQueda() + " litros de combustible.");
        } catch(Exception e){
            System.out.println("Error al hacer el viaje: " + e.getMessage());
        }
    }
    
    private static void viaje3_AZM(Rueda rueda) {
        try{
            System.out.println("Intentando realizar un viaje de 800 kilómetros...");
            rueda.viaje(800); 
            System.out.println("Quedan: " + rueda.getCombustibleQueda() + " litros de combustible.");
        } catch(Exception e){
            System.out.println("Error al hacer el viaje: " + e.getMessage());
        }
    }
    
    private static void rellenar1_AZM(Rueda rueda) {
        try{
            System.out.println("Intentando rellenar el depósito con 10 litros y 40 centimos por litro...");
            rueda.rellenar(10,40);  
            System.out.println("Quedan: " + rueda.getCombustibleQueda() + " litros de combustible.");
        } catch(Exception e){
            System.out.println("Error al rellenar el deposito: " + e.getMessage());
        }
    }
    
    private static void rellenar2_AZM(Rueda rueda) {
        try{
            System.out.println("Intentando rellenar el depósito con 100 litros y 40 centimos por litro (debería fallar)...");
            rueda.rellenar(100,40);  
            System.out.println("Quedan: " + rueda.getCombustibleQueda() + " litros de combustible.");
        } catch(Exception e){
            System.out.println("Error al rellenar el deposito: " + e.getMessage());
        }
    }
}


