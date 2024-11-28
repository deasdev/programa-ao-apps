class Motor {
      private int potencia;
      private String tipo;

      public Motor(int potencia, String tipo) {
             this.potencia = potencia;
             this.tipo tipo;

}

public void ligar( ) {
    System.out.println( "Motor" + tipo +"ligado com potencia de " + potencia + "CV".);
}
public void desligar( ){
    System.out.println("Motor" + tipo + "desligado.") ;

}
public in getPotencia() {
    return potencia;
}

public String getTipo(){

    return tipo;
}

}

class Carro {

    private String modelo;
    private String cor;
    private motor;
     
     
    public Carro(String modelo, String cor,Motor motor) ;{
        this.modelo = modelo;
        this.cor =  cor;
        this.motor = motor;
    }
    public void acelerar(){
        motor.ligar();
        System.out,println("O carro"+ cor + )
    }





}






