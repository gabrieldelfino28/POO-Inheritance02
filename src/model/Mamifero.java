package model;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(){
        alteraAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados() {
        System.out.println(getNome() + " \n" + getComprimento() + " cm \n" + getPatas() + " \n" + getCor()  + " \n" + getAmbiente()  + " \n" + getVelocidade()+" m/s\n" + getAlimento() + "\n\n");
    }
}
