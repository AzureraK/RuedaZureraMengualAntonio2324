package RuedaZureraMengualAntonio2324;

/**
 * Clase Rueda que modela el comportamiento de un vehículo en términos de su capacidad de combustible y consumo.
 * Permite realizar operaciones como realizar un viaje, basándose en el consumo de combustible, y rellenar el tanque de combustible.
 */
public class Rueda {
    
    private int combustible_queda;  
    private double centimos_litro;
    private int capacidad; // Capacidad del depósito en litros.
    private int consumoAZM = 6; // Consumo en litros a los cien kilómetros

    /**
     * Constructor por defecto que inicializa una nueva instancia de Rueda sin parámetros específicos.
     */
    public Rueda() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Rueda con valores específicos para el combustible restante,
     * el costo por litro de combustible y la capacidad del depósito.
     * 
     * @param combustible_queda El combustible restante en el vehículo (en litros).
     * @param centimos_litro El costo del combustible por litro (en centimos).
     * @param capacidad La capacidad total del depósito de combustible del vehículo (en litros).
     */
    public Rueda(int combustible_queda, double centimos_litro, int capacidad) {
        this.combustible_queda = combustible_queda;
        this.centimos_litro = centimos_litro;
        this.capacidad = capacidad;
    }

    // Métodos de acceso (Getters y Setters)
    
    /**
     * Devuelve la cantidad de combustible restante en el vehículo.
     * 
     * @return La cantidad de combustible restante (en litros).
     */
    public int getCombustibleQueda() {
        return getCombustible_queda();
    }

    /**
     * Establece la cantidad de combustible restante en el vehículo.
     * 
     * @param combustible_queda La nueva cantidad de combustible restante (en litros).
     */
    public void setCombustibleQueda(int combustible_queda) {
        this.setCombustible_queda(combustible_queda);
    }

    /**
     * Devuelve el costo del combustible por litro.
     * 
     * @return El costo por litro de combustible (en centimos).
     */
    public double getCentimosLitro() {
        return getCentimos_litro();
    }

    /**
     * Establece el costo del combustible por litro.
     * 
     * @param centimos_litro El nuevo costo por litro de combustible (en centimos).
     */
    public void setCentimosLitro(double centimos_litro) {
        this.setCentimos_litro(centimos_litro);
    }

    /**
     * Devuelve la capacidad total del depósito de combustible del vehículo.
     * 
     * @return La capacidad del depósito (en litros).
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad total del depósito de combustible del vehículo.
     * 
     * @param capacidad La nueva capacidad del depósito (en litros).
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Devuelve el consumo de combustible del vehículo en litros a los cien kilómetros.
     * 
     * @return El consumo de combustible (en litros a los cien kilómetros).
     */
    public int getConsumoAZM() {
        return consumoAZM;
    }

    /**
     * Establece el consumo de combustible del vehículo en litros a los cien kilómetros.
     * 
     * @param consumoAZM El nuevo consumo de combustible (en litros a los cien kilómetros).
     */
    public void setConsumoAZM(int consumoAZM) {
        this.consumoAZM = consumoAZM;
    }

    /**
     * Intenta realizar un viaje con el vehículo, disminuyendo el combustible restante según la distancia recorrida y el consumo por kilómetro.
     * 
     * @param km La distancia del viaje a realizar (en kilómetros).
     * @throws Exception Si no hay suficiente combustible para completar el viaje o si la distancia es negativa o cero.
     */
    public void viaje(int km) throws Exception {
        if (km <= 0) {
            throw new Exception("La distancia del viaje debe ser positiva.");
        }
        int combustibleNecesario = km * getConsumoAZM() / 100;
        if (combustibleNecesario > getCombustible_queda()) {
            throw new Exception("No hay suficiente combustible para realizar el viaje.");
        }
        this.setCombustible_queda(this.getCombustible_queda() - combustibleNecesario);
    }
    
    /**
     * Intenta rellenar el depósito de combustible del vehículo con una cantidad específica de litros, teniendo en cuenta el costo y el dinero proporcionado.
     * 
     * @param litros La cantidad de combustible con la que se intenta rellenar el depósito (en litros).
     * @param dinero La cantidad de dinero disponible para rellenar el depósito (en centimos).
     * @throws Exception Si la cantidad de litros o el dinero son insuficientes, o si rellenar supera la capacidad del depósito.
     */
    public void rellenar(int litros, double dinero) throws Exception {
        if (litros <= 0) {
            throw new Exception("La cantidad de litros a rellenar debe ser positiva.");
        }
        if (dinero < litros * getCentimos_litro()) {
            throw new Exception("No tiene suficiente dinero para rellenar el depósito.");
        }
        if (getCombustible_queda() + litros > getCapacidad()) {
            throw new Exception("No se puede rellenar el depósito porque se superaría la capacidad.");
        }
        this.setCombustible_queda(this.getCombustible_queda() + litros);
    }

    public int getCombustible_queda() {
        return combustible_queda;
    }

    public void setCombustible_queda(int combustible_queda) {
        this.combustible_queda = combustible_queda;
    }

    public double getCentimos_litro() {
        return centimos_litro;
    }

    public void setCentimos_litro(double centimos_litro) {
        this.centimos_litro = centimos_litro;
    }
}





    
    
    

