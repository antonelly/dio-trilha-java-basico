public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tvSala = new SmartTv();

        System.out.println("\nTV ligada: " + tvSala.ligada + "\n" + "Canal: " + tvSala.canal + "\n" + "Volume: " + tvSala.volume);
        
        tvSala.ligar();

        System.out.println("TV ligada: " + tvSala.ligada);

        tvSala.avancarCanal();
        tvSala.avancarCanal();
        tvSala.avancarCanal();
        tvSala.avancarCanal();

        System.out.println("\nNovo canal: " + tvSala.canal);

        tvSala.voltarCanal();
        tvSala.voltarCanal();

        System.out.println("Novo canal: " + tvSala.canal);

        tvSala.mudarCanal(38);

        System.out.println("Novo canal: " + tvSala.canal);

        tvSala.diminuirVolume();
        tvSala.diminuirVolume();
        tvSala.diminuirVolume();
        tvSala.diminuirVolume();
        tvSala.diminuirVolume();
        tvSala.diminuirVolume();

        System.out.println("\nNovo volume: " + tvSala.volume);

        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();

        System.out.println("\nNovo volume: " + tvSala.volume);
    }
}
