public class Cuenta {

    //Atributos
    private double saldo;

    //Getters y Setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //Constructores
    //Son las Instrucciones de como se inicializan los valores de la clase (Estos son los atributos que vas a necesitar pasra crearte)

    public Cuenta() {
        this.saldo = 0;

    }

    //Funciones

    public double depositar(double num) {
        this.saldo = num + this.saldo;
        return this.saldo;
    }
    public double sacar(double num) {

        if (this.saldo >= num) {
            this.saldo = this.saldo - num;
            return this.saldo;
        }else  {
            return -1;
        }

    }


}
