package Exercicio1;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String mensagem) {
        System.out.println(mensagem);
    }
}