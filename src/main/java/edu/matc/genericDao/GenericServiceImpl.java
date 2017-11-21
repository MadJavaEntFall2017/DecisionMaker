package edu.matc.genericDao;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Map;

/**
 * The Generic service class.
 *
 * @param <T> the type parameter
 */
public class GenericServiceImpl<T> implements IGenericService<T> {
    private IGenericDAO<T> dao;
    private Class<T> cl;

    /**
     * Instantiates a new Generic service.
     *
     * @param cl             the class
     * @param sessionFactory the session factory
     */
    public GenericServiceImpl(Class<T> cl, SessionFactory sessionFactory) {
        this.cl=cl;
        dao=new GenericDAOImpl<T>(cl, sessionFactory);
    }

    @Override
    public T get(Class<T> cl, Integer id) {
        //LOGGER.trace("STARTED - get");
        return (T) dao.get(cl, id);
    }

    @Override
    public T save(T object) {
        return (T)dao.save(object);
    }

    @Override
    public void update(T object) {
        dao.update(object);
    }

    @Override
    public void delete(T object) {
        dao.delete(object);
    }

    @Override
    public List<T> query(String hsql, Map<String, Object> params) {
        return (List<T>)dao.query(hsql, params);
    }

    @Override
    public List<T> getAll() {
        return query("from "+cl.getName(), null);
    }

    @Override
    public void deleteAll() {
        query("delete from "+cl.getName(),null);

    }
}
