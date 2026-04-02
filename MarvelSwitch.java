public class MarvelSwitch {
    public static void main(String[] args) {
        String faseWanda = "Feiticeira Escarlate";

        String status = switch (faseWanda) {
            case "Vingadora" -> "Heroína em treinamento e controle de poderes.";
            case "WandaVision" -> "Criação de realidade alternativa (Hex) por luto.";
            case "Feiticeira Escarlate" -> "Poder máximo: Manipulação da magia do caos e do Darkhold.";
            case "Civil War" -> "Confinamento no complexo dos Vingadores.";
            default -> "Fase não identificada no multiverso.";
        };

        System.out.println("Status da Wanda: " + status);
    }
}
