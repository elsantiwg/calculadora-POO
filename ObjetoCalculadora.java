

public class ObjetoCalculadora {

    // Atributos 
    private int numero1;
    private int numero2;

    // Constructor 
    public ObjetoCalculadora() {
        super();
    }

    // Métodos
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        if (numero1 > 0) {
            this.numero1 = numero1;
        } else {
            System.out.println("Error: el valor de número 1 debe ser mayor que 0.");
        }
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        if (numero2 > 0) {
            this.numero2 = numero2;
        } else {
            System.out.println("Error: el valor de número 2 debe ser mayor que 0.");
        }
    }

    // Métodos de las operaciones
    public int calcularSuma() {
        return numero1 + numero2;
    }

    public int calcularResta() {
        return numero1 - numero2;
    }

    public int calcularMultiplicacion() {
        return numero1 * numero2;
    }

    public int calcularDivision() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("no se puede dividir por 0.");
            return 0;
        }
    }
}
