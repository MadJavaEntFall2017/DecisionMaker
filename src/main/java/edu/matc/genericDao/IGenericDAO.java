package edu.matc.genericDao;
import java.util.List;
import java.util.Map;

/**
 * The Generic dao interface.
 *
 * @param <T> the type parameter
 */
public interface IGenericDAO<T> {

    /**
     * Get T.
     *
     * @param cl the cl
     * @param id the id
     * @return the t
     */
    public T get(Class<T> cl, Integer id);

    /**
     * Save T.
     *
     * @param object the object
     * @return the t
     */
    public T save(T object);

    /**
     * Update T.
     *
     * @param object the object
     */
    public void update(T object);

    /**
     * Delete T.
     *
     * @param object the object
     */
    public void delete(T object);

    /**
     * Query list.
     *
     * @param hsql   the hsql
     * @param params the params
     * @return the list
     */
    public List<T> query(String hsql, Map<String, Object> params);
}
