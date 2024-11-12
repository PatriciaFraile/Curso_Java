public final class Triangulo extends Figura {
    private double resultado;
    private int altura , base;

    public Triangulo(int altura, int base) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public double calcularArea() {
        super.calcularArea();
        this.resultado = (base * altura) / 2;
        System.out.println("El area es:\t" + resultado);
        return this.resultado;
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}