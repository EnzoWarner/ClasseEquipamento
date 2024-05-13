
public class TesteEquipamentoSonoro {
    public static void main(String[] args) {
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(false, true, 3);
        System.out.println("Antes de ligar:");
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.ligar();
        System.out.println("\nDepois de ligar:");
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.aumentarVolume();
        System.out.println("\nDepois de aumentar o volume:");
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.mono();
        System.out.println("\nDepois de mudar para modo mono:");
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.diminuirVolume();
        System.out.println("\nDepois de diminuir o volume:");
        System.out.println(equipamentoSonoro);
    }
}