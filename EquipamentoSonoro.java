
class EquipamentoSonoro extends Equipamento {
    private boolean stereo;
    private int volume;

    public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {
        super(ligado);
        this.stereo = stereo;
        this.volume = volume;
    }

    public void mono() {
        this.stereo = false;
    }

    public void stereo() {
        this.stereo = true;
    }

    @Override
    public void ligar() {
        super.ligar();
        this.volume = 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stereo: " + stereo + ", Volume: " + volume;
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}

