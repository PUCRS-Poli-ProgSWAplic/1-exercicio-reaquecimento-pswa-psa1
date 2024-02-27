interface DiaDaSemanaStrategy {
    void exibirMensagem();
}

class SegundaFeira implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é segunda-feira!");
    }
}

class TercaFeira implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é terça-feira!");
    }
}

class QuartaFeira implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é quarta-feira!");
    }
}

class QuintaFeira implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é quinta-feira!");
    }
}

class SextaFeira implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é sexta-feira!");
    }
}

class Sabado implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é sábado!");
    }
}

class Domingo implements DiaDaSemanaStrategy {
    @Override
    public void exibirMensagem() {
        System.out.println("Hoje é domingo!");
    }
}

class MensagemDoDia {
    private DiaDaSemanaStrategy strategy;

    public MensagemDoDia(DiaDaSemanaStrategy strategy) {
        this.strategy = strategy;
    }

    public void exibirMensagem() {
        strategy.exibirMensagem();
    }
}

public class Ex2 {
    public static void main(String[] args) {
        MensagemDoDia segunda = new MensagemDoDia(new SegundaFeira());
        segunda.exibirMensagem();

        MensagemDoDia terca = new MensagemDoDia(new TercaFeira());
        terca.exibirMensagem();

        MensagemDoDia quarta = new MensagemDoDia(new QuartaFeira());
        quarta.exibirMensagem();

        MensagemDoDia quinta = new MensagemDoDia(new QuintaFeira());
        quinta.exibirMensagem();

        MensagemDoDia sexta = new MensagemDoDia(new SextaFeira());
        sexta.exibirMensagem();

        MensagemDoDia sabado = new MensagemDoDia(new Sabado());
        sabado.exibirMensagem();

        MensagemDoDia domingo = new MensagemDoDia(new Domingo());
        domingo.exibirMensagem();
    }
}