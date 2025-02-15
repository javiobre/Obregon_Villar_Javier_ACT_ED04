package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones básicas como ingresar y retirar dinero.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;

    /** Número de cuenta */
    private String cuenta;

    /** Saldo disponible en la cuenta */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta */
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta bancaria.
     *
     * @param nombre Titular de la cuenta.
     * @param cuenta Número de cuenta.
     * @param saldo Saldo inicial de la cuenta.
     * @param tipoInteres Tipo de interés aplicado.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible en la cuenta.
     *
     * @return Saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     *
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }
}

