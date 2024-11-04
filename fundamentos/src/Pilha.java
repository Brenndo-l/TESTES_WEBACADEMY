import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {
    List<T> pilha = new ArrayList<>();
    int tamanho = 0;

    public int size() {
        return tamanho;
    }

    public void push(T item) {
        pilha.add(item);
        tamanho++;
    }

    public boolean isVazia() {
        return (tamanho == 0);
    }

    public T pop() {
        T item;
        if (!isVazia()) {
            item = pilha.remove(tamanho - 1);
            tamanho--;
        } else
            throw new EmptyStackException();
        return item;
    }
}
