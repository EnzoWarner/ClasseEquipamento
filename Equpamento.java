class Equipamento {
    private boolean ligado;

    public Equipamento(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public String toString() {
        return "Equipamento está " + (ligado ? "ligado" : "desligado");
    }
}
