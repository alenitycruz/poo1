package desafioum.exercicioum;

public class Veiculo {
    //ABSTRACAO
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade = 0;
    private double preço;



    //GETTERS & SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }



    //METODOS
    public void acelerar() {
        if (velocidade >= 0) velocidade = velocidade + 20;
    }

    public void abastecer(int combustivel) {
        litrosCombustivel = litrosCombustivel + combustivel;
        if (litrosCombustivel > 60){
            System.out.println("Limite de 60 litros excedido!");
        }
    }

    public void frear() {
        if (velocidade >= 20) velocidade = velocidade - 20;

    }

    public void pintar(String cor) {
        this.setCor(cor);

    }

    public void ligar() {
        if (this.isLigado == false){

            this.setLigado(true);
        }
    }

    public void desligar() {
        if (this.isLigado == true && velocidade == 0) {
            this.setLigado(false);
        } else {
            this.setLigado(true);
        }


    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + this.getMarca() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                ", placa='" + this.getPlaca() + '\'' +
                ", cor='" + this.getCor() + '\'' +
                ", km=" + this.getKm() +
                ", isLigado=" + this.isLigado() +
                ", litrosCombustivel=" + this.getLitrosCombustivel() +
                ", velocidade=" + this.getVelocidade() +
                ", preço=" + this.getPreço() +
                '}';
    }
}
