package edu.matc.genericDao;
import java.util.List;

/**
 * The Generic service interface.
 *
 * @param <T> the type parameter
 */
public interface IGenericService<T> extends IGenericDAO<T> {

    /**
     * Gets all.
     *
     * @return all
     */
    List<T> getAll();

    /**
     * Deletes all.
     */
    void deleteAll();
}
