package model;

public class Peixe extends Animal{
    private String caracterisca;
    public Peixe() {
        alteraPatas(0);
        alteraAmbiente("Mar");
        alteraCor("Cinzenta");
        alteraCaracterisca("Barbatanas e cauda;");
    }

    public String getCaracterisca() {
        return caracterisca;
    }

    public void alteraCaracterisca(String caracterisca) {
        this.caracterisca = caracterisca;
    }

    @Override
    public void dados() {
        System.out.println(getNome() + " \n" + getComprimento() + " cm \n" +  getCor()  + " \n" + getAmbiente()  + " \n" + getVelocidade()+" m/s\n" + getCaracterisca() + "\n\n");
    }

    @Override
    public void alteraPatas(int patas) {

    }
}
