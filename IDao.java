package dao;

import java.util.List;

public interface IDao<T> {
    void guardar(T t);

    public T buscar(Long id);

    void eliminar(long id);

    List<T> buscarTodos();
}
