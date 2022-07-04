package processador;

import java.util.concurrent.ThreadFactory;

public class FabricaDeThreads implements ThreadFactory {
    private static int numero = 1;

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "Thread de número: " + numero);
        numero++;
        thread.setUncaughtExceptionHandler(new TratadorDeExcecao());
        return thread;
    }
}
