package processador;

public class TratadorDeExcecao implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Ocorreu uma exceção na thread " + t.getName() + ", " + e.getMessage());
    }
}
