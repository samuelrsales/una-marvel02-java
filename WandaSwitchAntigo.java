public class WandaSwitchAntigo {
    public static void main(String[] args) {
        String faseWanda = "WandaVision";
        String status;

        switch (faseWanda) {
            case "Vingadora":
                status = "Heroína em treinamento.";
                break; // Obrigatório para parar a execução aqui

            case "WandaVision":
                status = "Criação do Hex e vida suburbana.";
                break;

            case "Feiticeira Escarlate":
                status = "Domínio da Magia do Caos.";
                break;

            default:
                status = "Fase desconhecida.";
                break; // Opcional no último item, mas boa prática
        }

        System.out.println("Status: " + status);
    }
}
